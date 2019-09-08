package api.controller;

import api.domain.entities.object.Customers;
import api.exception.ParameterInvalidException;
import api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CustomerController {

    private static final String DELIMITER = ", ";

    private CustomerService customerService;
    private CustomerRequestFactory factory;

    @Autowired
    public CustomerController(final CustomerService customerService, final CustomerRequestFactory factory) {

        this.customerService = customerService;
        this.factory = factory;
    }

    @PostMapping("/api/v1/order/addCustomer")
    public CustomerResponse addCustomer(@Valid @RequestBody CustomerRequestBody requestBody,
                BindingResult bindingResult) throws ParameterInvalidException {

        if(bindingResult.hasErrors()) {
            throw new ParameterInvalidException(getErrorMessage(bindingResult));
        }

        final Customers customers = factory.toCustomers(requestBody);
        customerService.addCustomer(customers);
        return new CustomerResponse(HttpStatus.OK.value());
    }

    private String getErrorMessage(BindingResult bindingResult) {

        final StringBuilder message = new StringBuilder();
        bindingResult.getFieldErrors().forEach(fieldError -> message
                .append(fieldError.getDefaultMessage())
                .append(DELIMITER));
        message.setLength(message.length() - 2);
        return message.toString();
    }
}

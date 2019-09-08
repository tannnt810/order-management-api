package api.controller;

import api.domain.entities.object.Order;
import api.domain.entities.object.OrderDetail;
import api.exception.ParameterInvalidException;
import api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;
    private OrderResponseFactory orderResponseFactory;

    @Autowired
    public OrderController(OrderService orderService, OrderResponseFactory orderResponseFactory) {
        this.orderService = orderService;
        this.orderResponseFactory = orderResponseFactory;
    }

    @GetMapping("/api/v1/orders")
    public List<OrderResult> ordersByCustomerNumber(
            @Valid @ModelAttribute OrderModelAttribute orderModelAttribute,
            BindingResult bindingResult) throws ParameterInvalidException {

        if (bindingResult.hasErrors()) {
            throw new ParameterInvalidException(getErrorMessage(bindingResult));
        }

        List<OrderDetail> orderList = orderService.getOrdersByCustomer(Integer.parseInt(orderModelAttribute.getCustomerNumber()));
        return orderResponseFactory.toOrderResultList(orderList);
    }

    private String getErrorMessage(BindingResult bindingResult) {

        // Create message from BindingResult
        // Ex: 'name': must not be empty
        StringBuilder message = new StringBuilder();
        bindingResult.getFieldErrors().forEach(fieldError -> message
                .append("'")
                .append(fieldError.getField())
                .append("'")
                .append(": ")
                .append(fieldError.getDefaultMessage())
                .append(", "));
        return message.toString();
    }
}

package order.repository.factory;

import order.domain.entities.object.Customer;
import order.domain.entities.object.Order;
import order.domain.value.object.CustomerNumber;
import order.domain.value.object.OrderNumber;
import order.repository.model.CustomerModel;
import order.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerFactory {

    private EmployeeService employeeService;

    @Autowired
    public CustomerFactory(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<Customer> toListCustomer(List<CustomerModel> customerModelList) {

        return customerModelList.stream().map(this::toOrder).collect(Collectors.toList());
    }

    public Customer toFirstCustomer(List<CustomerModel> customerModelList) {
        return toOrder(customerModelList.get(0));
    }

    private Customer toOrder(CustomerModel customerModel) {

        CustomerNumber customerNumber = new CustomerNumber(customerModel.getCustomerNumber());

        return new Customer(
                customerNumber
                , customerModel.getCustomerName()
                , customerModel.getContactLastName()
                , customerModel.getContactFirstName()
                , customerModel.getPhone()
                , customerModel.getAddressLine1()
                , customerModel.getAddressLine2()
                , customerModel.getCity()
                , customerModel.getState()
                , customerModel.getPostalCode()
                , customerModel.getCountry()
                , employeeService.findByEmployeeNumber(customerModel.getSalesRepEmployeeNumber())
                , customerModel.getCreditLimit()
        );
    }
}
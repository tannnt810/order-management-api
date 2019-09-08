package api.repository;

import api.domain.entities.object.Customer;
import api.domain.entities.object.Employee;
import api.domain.entities.object.Order;
import api.domain.value.object.customer.CustomerNumber;
import api.domain.value.object.employee.EmployeeNumber;
import api.domain.value.object.order.OrderNumber;
import api.repository.mapper.OrderModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderFactory {
    public Order toOrder(OrderModel orderModel) {
        OrderNumber orderNumber = new OrderNumber(orderModel.getOrderNumber());
        Customer customer = new Customer(new CustomerNumber(orderModel.getCustomerNumber()), orderModel.getCustomerName(), orderModel.getPhone(), orderModel.getCountry(), new Employee(new EmployeeNumber(10000), orderModel.getEmployeeEmail()));

        return new Order(orderNumber, orderModel.getOrderDate(), orderModel.getStatus(), customer);
    }

    public List<Order> toOrderList(List<OrderModel> orderModelList) {
        return orderModelList.stream().map(this::toOrder).collect(Collectors.toList());
    }
}

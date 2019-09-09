package order.repository.factory;

import order.domain.CustomerRepository;
import order.domain.entities.object.Customer;
import order.domain.entities.object.Order;
import order.domain.entities.object.OrderDetail;
import order.domain.value.object.OrderNumber;
import order.repository.model.OrderModel;
import order.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderFactory {

    private CustomerService customerService;

    @Autowired
    public OrderFactory(CustomerService customerService) {
        this.customerService = customerService;
    }

    public List<Order> toListOrder(List<OrderModel> orderModelList) {

        return orderModelList.stream().map(this::toOrder).collect(Collectors.toList());
    }

    private Order toOrder(OrderModel orderModel) {

        OrderNumber orderNumber = new OrderNumber(orderModel.getOrderNumber());

        return new Order(
                orderNumber
                , orderModel.getOrderDate()
                , orderModel.getRequiredDate()
                , orderModel.getShippedDate()
                , orderModel.getStatus()
                , orderModel.getComments()
                , customerService.findByCustomerNumber(orderModel.getCustomerNumber())
        );
    }
}
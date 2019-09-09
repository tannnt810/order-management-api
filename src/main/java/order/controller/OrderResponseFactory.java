package order.controller;

import order.domain.entities.object.Order;
import order.domain.entities.object.OrderDetail;
import order.domain.entities.object.Product;
import order.service.OrderDetailService;
import order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderResponseFactory {

    OrderDetailService orderDetailService;
    ProductService productService;

    @Autowired
    public OrderResponseFactory(OrderDetailService orderDetailService, ProductService productService) {
        this.orderDetailService = orderDetailService;
        this.productService = productService;
    }

    public OrderResponse toOrderResponse(List<Order> orderList) {

        return new OrderResponse(toListOrderResult(orderList));
    }

    public List<OrderResult> toListOrderResult (List<Order> orderList) {

        return orderList.stream().map(this::toOrderResult).collect(Collectors.toList());
    }

    private OrderResult toOrderResult(Order order) {

        OrderResult orderResult = new OrderResult(
                order.getOrderNumber().getOrderNumber()
                , order.getOrderDate()
                , order.getRequiredDate()
                , order.getShippedDate()
                , order.getStatus()
                , order.getComments()
                , order.getCustomer()
        );

        orderResult.setOderDetail(orderDetailService.findByOrderNumber(order.getOrderNumber().getOrderNumber()));
        return orderResult;
    }
}

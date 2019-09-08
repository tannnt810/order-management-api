//package api.repository;
//
//import api.domain.entities.object.*;
//import api.domain.value.object.customer.CustomerNumber;
//import api.domain.value.object.employee.EmployeeNumber;
//import api.domain.value.object.order.OrderNumber;
//import api.domain.value.object.product.ProductCode;
//import api.repository.mapper.OrderModel;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class OrderDetailFactory {
//    public OrderDetail toOrderDetail(OrderModel orderModel) {
//
//        Product product = new Product(new ProductCode("P1"), "Product 1", new BigDecimal(10000)));
//        return new OrderDetail(product);
//    }
//
//    public List<Order> toOrderList(List<OrderModel> orderModelList) {
//        return orderModelList.stream().map(this::toOrderDetail).collect(Collectors.toList());
//    }
//}

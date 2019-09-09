package order.repository.factory;

import order.domain.entities.object.Order;
import order.domain.entities.object.OrderDetail;
import order.domain.value.object.OrderNumber;
import order.domain.value.object.ProductCode;
import order.repository.model.OrderDetailModel;
import order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderDetailFactory {

    private ProductService productService;

    @Autowired
    public OrderDetailFactory(ProductService productService) {
        this.productService = productService;
    }

    public List<OrderDetail> toListOrderDetail(List<OrderDetailModel> orderDetailModelList) {

        return orderDetailModelList.stream().map(this::toOrderDetail).collect(Collectors.toList());
    }

    private OrderDetail toOrderDetail(OrderDetailModel orderDetailModel) {

        OrderNumber orderNumber = new OrderNumber(orderDetailModel.getOrderNumber());
        ProductCode productCode = new ProductCode(orderDetailModel.getProductCode());

        OrderDetail orderDetail = new OrderDetail(
                orderNumber
                , productCode
                , orderDetailModel.getQuantityOrdered()
                , orderDetailModel.getPriceEach()
                , orderDetailModel.getOrderLineNumber()
        );

        orderDetail.setProduct(this.productService.findByProductCode(orderDetailModel.getProductCode()));
        return orderDetail;
    }
}
package order.domain;

import order.domain.entities.object.OrderDetail;

import java.util.List;

public interface OrderDetailRepository {

    List<OrderDetail> findByOrderNumber(Integer orderNumber);
}

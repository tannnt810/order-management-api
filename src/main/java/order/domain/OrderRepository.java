package order.domain;

import order.domain.entities.object.Order;

import java.util.List;

public interface OrderRepository {

    List<Order> getAll();
}

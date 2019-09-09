package order.service;

import order.domain.OrderDetailRepository;
import order.domain.ProductRepository;
import order.domain.entities.object.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    private OrderDetailRepository orderDetailRepository;
    private ProductRepository productRepository;

    @Autowired
    public OrderDetailService(OrderDetailRepository orderDetailRepository, ProductRepository productRepository) {
        this.orderDetailRepository = orderDetailRepository;
        this.productRepository = productRepository;
    }

    public List<OrderDetail> findByOrderNumber(Integer orderNumber) {
        return orderDetailRepository.findByOrderNumber(orderNumber);
    }
}
package order.repository;

import order.domain.OrderRepository;
import order.domain.entities.object.Order;
import order.repository.factory.OrderFactory;
import order.repository.mapper.OrderMapper;
import order.repository.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class OrderRepositoryImpl extends JdbcDaoSupport implements OrderRepository {

    private OrderMapper orderMapper;
    private OrderFactory orderFactory;

    @Autowired
    public OrderRepositoryImpl(DataSource dataSource, OrderMapper orderMapper, OrderFactory orderFactory) {
        this.setDataSource(dataSource);
        this.orderMapper = orderMapper;
        this.orderFactory = orderFactory;
    }

    public List<Order> getAll() {

        String sql = "SELECT * " +
                "FROM orders " +
                "LIMIT 50";

        List<OrderModel> orderModelList = this.getJdbcTemplate().query(sql, orderMapper);

        return orderFactory.toListOrder(orderModelList);
    }
}
package order.repository;

import order.domain.OrderDetailRepository;
import order.domain.entities.object.OrderDetail;
import order.repository.factory.OrderDetailFactory;
import order.repository.mapper.OrderDetailMapper;
import order.repository.model.OrderDetailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class OrderDetailRepositoryImpl extends JdbcDaoSupport implements OrderDetailRepository {

    private OrderDetailMapper orderDetailMapper;
    private OrderDetailFactory orderDetailFactory;

    @Autowired
    public OrderDetailRepositoryImpl(DataSource dataSource, OrderDetailMapper orderDetailMapper, OrderDetailFactory orderDetailFactory) {
        this.setDataSource(dataSource);
        this.orderDetailMapper = orderDetailMapper;
        this.orderDetailFactory = orderDetailFactory;
    }

    public List<OrderDetail> findByOrderNumber(Integer orderNumber) {

        String sql = "SELECT * " +
                "FROM orderdetails " +
                "WHERE orderNumber = ?";

        List<OrderDetailModel> orderDetailModelList = this.getJdbcTemplate().query(sql, orderDetailMapper, orderNumber);

        return orderDetailFactory.toListOrderDetail(orderDetailModelList);
    }
}
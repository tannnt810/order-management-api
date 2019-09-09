package order.repository.mapper;

import order.repository.model.OrderModel;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Component
public class OrderMapper implements RowMapper<OrderModel> {
    @Override
    public OrderModel mapRow(ResultSet resultSet, int  rowNum) throws SQLException {
        Integer orderNumber = resultSet.getInt("orderNumber");
        Date orderDate = resultSet.getDate("orderDate");
        Date requiredDate = resultSet.getDate("requiredDate");
        Date shippedDate = resultSet.getDate("shippedDate");
        String status = resultSet.getString("status");
        String comments = resultSet.getString("comments");
        Integer customerNumber = resultSet.getInt("customerNumber");

        return new OrderModel(
                orderNumber
                , orderDate
                , requiredDate
                , shippedDate
                , status
                , comments
                , customerNumber
        );
    }
}

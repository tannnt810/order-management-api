package api.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Component
public class OrderMapper implements RowMapper<OrderModel> {

    @Override
    public OrderModel mapRow(ResultSet resultSet, int i) throws SQLException {
        int orderNumber = resultSet.getInt("orderNumber");
        Date orderDate = resultSet.getDate("orderDate");
        String status = resultSet.getString("status");
//        String productName = resultSet.getString("productName");
//        BigDecimal buyPrice = resultSet.getBigDecimal("buyPrice");
//        String customerName = resultSet.getString("customerName");
//        String phone = resultSet.getString("phone");
//        String country = resultSet.getString("country");
        String employeeEmail = resultSet.getString("email");

//        return new OrderModel(orderNumber, orderDate, status, productName, buyPrice, customerName, phone, country, employeeEmail);
        return new OrderModel(orderNumber, orderDate, employeeEmail);
    }
}

package order.repository.mapper;

import order.repository.model.OrderDetailModel;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Component
public class OrderDetailMapper implements RowMapper<OrderDetailModel> {
    @Override
    public OrderDetailModel mapRow(ResultSet resultSet, int  rowNum) throws SQLException {
        Integer orderNumber = resultSet.getInt("orderNumber");
        String productCode = resultSet.getString("productCode");
        Integer quantityOrdered = resultSet.getInt("quantityOrdered");
        BigDecimal priceEach = resultSet.getBigDecimal("priceEach");
        Integer orderLineNumber = resultSet.getInt("orderLineNumber");

        return new OrderDetailModel(
                orderNumber
                , productCode
                , quantityOrdered
                , priceEach
                , orderLineNumber
        );
    }
}

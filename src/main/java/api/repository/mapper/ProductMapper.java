package api.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

@Component
public class ProductMapper implements RowMapper<ProductModel> {

    @Override
    public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException {
        String productCode = resultSet.getString("productCode");
        String productName = resultSet.getString("productName");
        BigDecimal buyPrice = resultSet.getBigDecimal("buyPrice");

        return new ProductModel(productCode, productName, buyPrice);
    }
}

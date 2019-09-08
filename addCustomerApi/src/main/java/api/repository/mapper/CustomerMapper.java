package api.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CustomerMapper implements RowMapper<CustomerModel> {

    @Override
    public CustomerModel mapRow(ResultSet resultSet, int i) throws SQLException {

        final int customerNumber = resultSet.getInt("customerNumber");
        final String customerName = resultSet.getString("customerName");
        final String contactLastName = resultSet.getString("contactLastName");
        final String contactFirstName = resultSet.getString("contactFirstName");
        final String phone = resultSet.getString("phone");
        final String addressLine1 = resultSet.getString("addressLine1");
        final String addressLine2 = resultSet.getString("addressLine2");
        final String city = resultSet.getString("city");
        final String state = resultSet.getString("state");
        final String postalCode = resultSet.getString("postalCode");
        final String country = resultSet.getString("country");
        final int salesRepEmployeeNumber = resultSet.getInt("salesRepEmployeeNumber");
        final BigDecimal creditLimit = resultSet.getBigDecimal("creditLimit");

        return new CustomerModel(customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1,
                addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit);
    }
}

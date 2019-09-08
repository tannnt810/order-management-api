package api.repository;

import api.domain.CustomerRepository;
import api.domain.entities.object.Customers;
import api.repository.mapper.CustomerMapper;
import api.repository.mapper.CustomerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CustomerRepositoryImpl extends JdbcDaoSupport implements CustomerRepository {

    private Logger log = LoggerFactory.getLogger(CustomerRepositoryImpl.class);

    private CustomerMapper customerMapper;

    @Autowired
    public CustomerRepositoryImpl(final CustomerMapper customerMapper, final DataSource dataSource) {

        this.customerMapper = customerMapper;
        this.setDataSource(dataSource);
    }

    @Override
    public boolean addCustomer(final Customers customer) {

        final String sql = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName,"
                + "phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber,"
                + "creditLimit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        this.getJdbcTemplate().update(sql, customer.getCustomerNumber().getCustomerNumber(),
                customer.getCustomerName(), customer.getContactLastName(), customer.getContactFirstName(),
                customer.getPhone(), customer.getAddressLine1(),
                customer.getAddressLine2(), customer.getCity(), customer.getState(),
                customer.getPostalCode(), customer.getCountry(),
                customer.getSalesRepEmployeeNumber(), customer.getCreditLimit());
        log.info("Add new customer successfully");
        return true;
    }

    @Override
    public boolean isExisted(final int customerNumber) {

        final String sql = "SELECT * FROM customers WHERE customerNumber = ?";
        final List<CustomerModel> result = this.getJdbcTemplate().query(sql, customerMapper, customerNumber);
        return result.size() > 0;
    }
}

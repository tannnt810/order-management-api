package order.repository;

import order.domain.CustomerRepository;
import order.domain.entities.object.Customer;
import order.repository.factory.CustomerFactory;
import order.repository.mapper.CustomerMapper;
import order.repository.model.CustomerModel;
import order.repository.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CustomerRepositoryImpl extends JdbcDaoSupport implements CustomerRepository {

    private CustomerMapper customerMapper;
    private CustomerFactory customerFactory;

    @Autowired
    public CustomerRepositoryImpl(DataSource dataSource, CustomerMapper customerMapper, CustomerFactory customerFactory) {
        this.setDataSource(dataSource);
        this.customerMapper = customerMapper;
        this.customerFactory = customerFactory;
    }

    public Customer findByCustomerNumber(Integer customerNumber) {

        String sql = "SELECT * " +
                "FROM customers " +
                "WHERE customerNumber = ?";

        List<CustomerModel> customerModelList = this.getJdbcTemplate().query(sql, customerMapper, customerNumber);

        return customerFactory.toFirstCustomer(customerModelList);
    }
}
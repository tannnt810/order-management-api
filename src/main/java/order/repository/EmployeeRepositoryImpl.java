package order.repository;

import order.domain.EmployeeRepository;
import order.domain.entities.object.Employee;
import order.repository.factory.EmployeeFactory;
import order.repository.mapper.EmployeeMapper;
import order.repository.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl extends JdbcDaoSupport implements EmployeeRepository {

    private EmployeeMapper employeeMapper;
    private EmployeeFactory employeeFactory;

    @Autowired
    public EmployeeRepositoryImpl(DataSource dataSource, EmployeeMapper employeeMapper, EmployeeFactory employeeFactory) {
        this.setDataSource(dataSource);
        this.employeeMapper = employeeMapper;
        this.employeeFactory = employeeFactory;
    }

    public Employee findByEmployeeNumber(Integer employeeNumber) {

        String sql = "SELECT * " +
                "FROM employees " +
                "WHERE employeeNumber = ?";

        List<EmployeeModel> employeeModelList = this.getJdbcTemplate().query(sql, employeeMapper, employeeNumber);

        return employeeFactory.toFirstEmployee(employeeModelList);
    }
}
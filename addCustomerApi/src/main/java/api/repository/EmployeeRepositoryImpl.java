package api.repository;

import api.domain.EmployeeRepository;
import api.repository.mapper.EmployeeMapper;
import api.repository.mapper.EmployeeModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl extends JdbcDaoSupport implements EmployeeRepository {

    private Logger log = LoggerFactory.getLogger("EmployeeRepositoryImpl");

    private EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeRepositoryImpl(final DataSource dataSource, final EmployeeMapper employeeMapper) {

        this.setDataSource(dataSource);
        this.employeeMapper = employeeMapper;
    }

    @Override
    public boolean isExisted(final int employeeNumber) {

        final String sql = "SELECT * FROM employees WHERE employeeNumber = ?";
        final List<EmployeeModel> result = this.getJdbcTemplate().query(sql, employeeMapper, employeeNumber);
        return result.size() > 0;
    }
}

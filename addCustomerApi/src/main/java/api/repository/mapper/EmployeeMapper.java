package api.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<EmployeeModel> {

    @Override
    public EmployeeModel mapRow(ResultSet resultSet, int i) throws SQLException {

        final int employeeNumber = resultSet.getInt("employeeNumber");
        final String lastName = resultSet.getString("lastName");
        final String firstName = resultSet.getString("firstName");
        final String extension = resultSet.getString("extension");
        final String email = resultSet.getString("email");
        final String officeCode = resultSet.getString("officeCode");
        final int reportsTo = resultSet.getInt("reportsTo");
        final String jobTitle = resultSet.getString("jobTitle");

        return new EmployeeModel(employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle);
    }
}

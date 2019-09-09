package order.domain;

import order.domain.entities.object.Employee;

import java.util.List;

public interface EmployeeRepository {

    Employee findByEmployeeNumber(Integer employeeNumber);
}

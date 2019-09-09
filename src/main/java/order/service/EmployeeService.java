package order.service;

import order.domain.EmployeeRepository;
import order.domain.entities.object.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee findByEmployeeNumber(Integer employeeNumber) {

        return employeeRepository.findByEmployeeNumber(employeeNumber);
    }
}
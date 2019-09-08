package api.service;

import api.domain.CustomerRepository;
import api.domain.EmployeeRepository;
import api.domain.entities.object.Customers;
import api.exception.ParameterInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public CustomerService(final CustomerRepository customerRepository,
               final EmployeeRepository employeeRepository) {

        this.customerRepository = customerRepository;
        this.employeeRepository = employeeRepository;
    }

    public boolean addCustomer(final Customers customers) throws ParameterInvalidException {

        if (customerRepository.isExisted(customers.getCustomerNumber().getCustomerNumber())) {
            throw new ParameterInvalidException("Customer number is existed");
        }

        if (!ObjectUtils.isEmpty(customers.getSalesRepEmployeeNumber())) {
            if (!employeeRepository.isExisted(customers.getSalesRepEmployeeNumber())) {
                throw new ParameterInvalidException("Employee number is not existed");
            }
        }

        return customerRepository.addCustomer(customers);
    }
}

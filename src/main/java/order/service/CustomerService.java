package order.service;

import order.domain.CustomerRepository;
import order.domain.entities.object.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findByCustomerNumber(Integer customerNumber) {

        return customerRepository.findByCustomerNumber(customerNumber);
    }
}
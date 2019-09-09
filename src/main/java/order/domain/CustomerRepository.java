package order.domain;

import order.domain.entities.object.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer findByCustomerNumber(Integer customerNumber);
}

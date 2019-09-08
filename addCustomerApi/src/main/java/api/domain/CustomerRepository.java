package api.domain;

import api.domain.entities.object.Customers;

public interface CustomerRepository {

    boolean addCustomer(Customers customer);

    boolean isExisted(int customerNumber);
}

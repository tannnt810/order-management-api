package api.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class OrderModelAttribute {

    @NotEmpty(message = " is not empty!")
    private String customerNumber;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}

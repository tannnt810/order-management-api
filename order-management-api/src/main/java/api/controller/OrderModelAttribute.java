package api.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class OrderModelAttribute {

    @NotEmpty(message = " is required!")
    @Size(max = 11, message = " is larger than 11 characters!")
    @Pattern(regexp = "\\d+|\\z", message = " must be number!")
    private String customerNumber;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}

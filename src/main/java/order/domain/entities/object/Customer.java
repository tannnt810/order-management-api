package order.domain.entities.object;

import order.domain.value.object.CustomerNumber;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class Customer
{
    @NotNull
    private CustomerNumber customerNumber;
    @Size(max=50)
    private String customerName;
    @Size(max=50)
    private String contactLastName;
    @Size(max=50)
    private String contactFirstName;
    @Size(max=50)
    private String phone;
    @Size(max=50)
    private String addressLine1;
    private String addressLine2;
    @Size(max=50)
    private String city;
    @Size(max=50)
    private String state;
    @Size(max=15)
    private String postalCode;
    @Size(max=50)
    private String country;
    private Employee employee;
    private BigDecimal creditLimit;

    /**
     *
     * @param customerNumber
     * @param customerName
     * @param contactLastName
     * @param contactFirstName
     * @param phone
     * @param addressLine1
     * @param addressLine2
     * @param city
     * @param state
     * @param postalCode
     * @param country
     * @param employee
     * @param creditLimit
     */
    public Customer(@NotNull CustomerNumber customerNumber, @Size(max = 50) String customerName, @Size(max = 50) String contactLastName, @Size(max = 50) String contactFirstName, @Size(max = 50) String phone, @Size(max = 50) String addressLine1, String addressLine2, @Size(max = 50) String city, @Size(max = 50) String state, @Size(max = 15) String postalCode, @Size(max = 50) String country, Employee employee, BigDecimal creditLimit) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.employee = employee;
        this.creditLimit = creditLimit;
    }

    public CustomerNumber getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public Employee getEmployee() {
        return employee;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }
}

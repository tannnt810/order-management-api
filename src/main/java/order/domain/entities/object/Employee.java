package order.domain.entities.object;

import order.domain.value.object.EmployeeNumber;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
    @NotNull
    private EmployeeNumber employeeNumber;
    @Size(max = 50)
    private String lastName;
    @Size(max = 50)
    private String firstName;
    @Size(max = 50)
    private String extension;
    @Size(max = 100)
    private String email;
    @Size(max = 10)
    private String officeCode;
    private Integer reportsTo;
    @Size(max = 50)
    private String jobTitle;

    /**
     *
     * @param employeeNumber
     * @param lastName
     * @param firstName
     * @param extension
     * @param email
     * @param officeCode
     * @param reportsTo
     * @param jobTitle
     */
    public Employee(@NotNull EmployeeNumber employeeNumber, @Size(max = 50) String lastName, @Size(max = 50) String firstName, @Size(max = 50) String extension, @Size(max = 100) String email, @Size(max = 10) String officeCode, Integer reportsTo, @Size(max = 50) String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTitle = jobTitle;
    }

    public EmployeeNumber getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getExtension() {
        return extension;
    }

    public String getEmail() {
        return email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public Integer getReportsTo() {
        return reportsTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

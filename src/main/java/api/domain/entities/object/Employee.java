package api.domain.entities.object;

import api.domain.value.object.employee.Email;
import api.domain.value.object.employee.EmployeeNumber;

public class Employee {
    private EmployeeNumber employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String officeCode;
    private int reportsTo;
    private String jobTitle;

    public Employee(EmployeeNumber employeeNumber, String email) {
        this.employeeNumber = employeeNumber;
        this.email = email;
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

    public int getReportsTo() {
        return reportsTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

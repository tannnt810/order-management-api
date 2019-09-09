package order.domain.value.object;

public class EmployeeNumber {
    Integer employeeNumber;

    public EmployeeNumber(Integer employeeNumber) {
//        Preconditions.checkArgument(StringUtils.hasText(productCode), "productCode must be not null");

        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }
}

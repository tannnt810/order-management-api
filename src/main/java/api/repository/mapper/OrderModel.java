package api.repository.mapper;

import java.math.BigDecimal;
import java.util.Date;

public class OrderModel {
    private int orderNumber;
    private Date orderDate;
    private String status;
    private String productName;
    private BigDecimal buyPrice;
    private String customerName;
    private String phone;
    private String country;
    private String employeeEmail;

    public OrderModel(int orderNumber, Date orderDate, String status, String productName, BigDecimal buyPrice, String customerName, String phone, String country, String employeeEmail) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.status = status;
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.customerName = customerName;
        this.phone = phone;
        this.country = country;
        this.employeeEmail = employeeEmail;
    }

    public OrderModel(int orderNumber, Date orderDate, String employeeEmail) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.employeeEmail = employeeEmail;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }
}

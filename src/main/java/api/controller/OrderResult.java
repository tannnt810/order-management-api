package api.controller;

import api.domain.entities.object.Product;
import api.domain.value.object.order.OrderNumber;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderResult {
    private int orderNumber;
    private Date orderDate;
    private String status;
    private String productName;
    private BigDecimal buyPrice;
    private String customerName;
    private String phone;
    private String country;
    private String employeeEmail;
    private List<Product> products;

    public OrderResult(int orderNumber, Date orderDate, String employeeEmail, List<Product> products) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.employeeEmail = employeeEmail;
        this.products = products;
    }

    public OrderResult(int orderNumber, Date orderDate, String status, String productName, BigDecimal buyPrice, String customerName, String phone, String country, String employeeEmail) {
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

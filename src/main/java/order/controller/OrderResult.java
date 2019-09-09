package order.controller;

import order.domain.entities.object.Customer;
import order.domain.entities.object.OrderDetail;

import java.util.Date;
import java.util.List;

public class OrderResult {
    private Integer orderNumber;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String status;
    private String comments;
    private Customer customer;
    private List<OrderDetail> orderDetail;

    public OrderResult(Integer orderNumber, Date orderDate, Date requiredDate, Date shippedDate, String status, String comments, Customer customer) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;
        this.customer = customer;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public String getComments() {
        return comments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setOderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }
}
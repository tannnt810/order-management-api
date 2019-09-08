package api.domain.entities.object;

import api.domain.value.object.order.OrderNumber;

import java.util.Date;

public class Order {
    private OrderNumber orderNumber;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String status;
    private String comments;
    private Customer customer;

    public Order(OrderNumber orderNumber, Date orderDate, String status, Customer customer) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.status = status;
        this.customer = customer;
    }

    public OrderNumber getOrderNumber() {
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
}

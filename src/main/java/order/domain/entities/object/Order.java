package order.domain.entities.object;

import order.domain.value.object.OrderNumber;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Order {
    @NotNull
    private OrderNumber orderNumber;

    @NotNull
    private Date orderDate;
    @NotNull
    private Date requiredDate;
    private Date shippedDate;
    @Size(max = 50)
    private String status;
    private String comments;
    private Customer customer;

    /**
     *
     * @param orderNumber
     * @param orderDate
     * @param requiredDate
     * @param shippedDate
     * @param status
     * @param comments
     * @param customer
     */
    public Order(@NotNull OrderNumber orderNumber, @NotNull Date orderDate, @NotNull Date requiredDate, Date shippedDate, @Size(max = 50) String status, String comments, Customer customer) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;
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

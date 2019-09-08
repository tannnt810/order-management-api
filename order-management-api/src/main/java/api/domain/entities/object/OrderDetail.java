package api.domain.entities.object;

import java.math.BigDecimal;
import java.util.List;

public class OrderDetail {
    private Order order;
    private List<Product> products;
    private int quantityOrdered;
    private BigDecimal priceEach;
    private int orderLineNumber;

    public OrderDetail(Order order, List<Product> products) {
        this.order = order;
        this.products = products;
    }

    public Order getOrder() {
        return order;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public BigDecimal getPriceEach() {
        return priceEach;
    }

    public int getOrderLineNumber() {
        return orderLineNumber;
    }
}

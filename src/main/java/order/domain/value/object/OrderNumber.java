package order.domain.value.object;

import org.glassfish.jersey.internal.guava.Preconditions;
import org.springframework.util.StringUtils;

public class OrderNumber {
    Integer orderNumber;

    public OrderNumber(Integer orderNumber) {
        //Preconditions.checkArgument(StringUtils.hasText(productCode), "productCode must be not null");

        this.orderNumber = orderNumber;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }
}

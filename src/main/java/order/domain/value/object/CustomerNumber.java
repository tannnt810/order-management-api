package order.domain.value.object;

import org.glassfish.jersey.internal.guava.Preconditions;
import org.springframework.util.StringUtils;

public class CustomerNumber {
    Integer CustomerNumber;

    public CustomerNumber(Integer CustomerNumber) {
//        Preconditions.checkArgument(StringUtils.hasText(productCode), "productCode must be not null");

        this.CustomerNumber = CustomerNumber;
    }

    public Integer getCustomerNumber() {
        return CustomerNumber;
    }
}

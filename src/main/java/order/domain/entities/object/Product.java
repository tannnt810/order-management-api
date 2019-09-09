package order.domain.entities.object;

import order.domain.value.object.ProductCode;
import org.glassfish.jersey.internal.guava.Preconditions;
import org.springframework.util.StringUtils;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class Product {
    private ProductCode productCode;
    @Size(max = 70)
    private String productName;
    @Size(max = 50)
    private String productLine;
    @Size(max = 50)
    private String productScale;
    @Size(max = 50)
    private String productVendor;
    private String productDescription;
    private Integer quantityInStock;
    private BigDecimal buyPrice;
    private BigDecimal msrp;

    /**
     *
     * @param productCode
     * @param productName
     * @param productLine
     * @param productScale
     * @param productVendor
     * @param productDescription
     * @param quantityInStock
     * @param buyPrice
     * @param msrp
     */
    public Product(ProductCode productCode, @Size(max = 70) String productName, @Size(max = 50) String productLine, @Size(max = 50) String productScale, @Size(max = 50) String productVendor, String productDescription, Integer quantityInStock, BigDecimal buyPrice, BigDecimal msrp) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.msrp = msrp;
    }


    public ProductCode getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public BigDecimal getMsrp() {
        return msrp;
    }
}

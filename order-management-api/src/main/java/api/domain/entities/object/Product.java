package api.domain.entities.object;

import api.domain.value.object.product.ProductCode;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public class Product {
    @JsonIgnore
    private ProductCode productCode;
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private int quantityInStock;
    private BigDecimal buyPrice;
    private BigDecimal MSRP;

    public Product(ProductCode productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, int quantityInStock, BigDecimal buyPrice, BigDecimal MSRP) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.MSRP = MSRP;
    }

    public Product(String productName, BigDecimal buyPrice) {
        this.productName = productName;
        this.buyPrice = buyPrice;
    }

    public ProductCode getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }
}

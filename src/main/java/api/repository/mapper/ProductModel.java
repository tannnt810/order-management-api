package api.repository.mapper;

import java.math.BigDecimal;

public class ProductModel {
    private String productCode;
    private String productName;
    private BigDecimal buyPrice;

    public ProductModel(String productCode, String productName, BigDecimal buyPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.buyPrice = buyPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }
}

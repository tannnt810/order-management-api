package api.repository;

import api.domain.entities.object.Customer;
import api.domain.entities.object.Employee;
import api.domain.entities.object.Order;
import api.domain.entities.object.Product;
import api.domain.value.object.customer.CustomerNumber;
import api.domain.value.object.employee.EmployeeNumber;
import api.domain.value.object.order.OrderNumber;
import api.domain.value.object.product.ProductCode;
import api.repository.mapper.OrderModel;
import api.repository.mapper.ProductModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductFactory {
    public Product toProduct(ProductModel productModel) {

        return new Product(new ProductCode(productModel.getProductCode()), productModel.getProductName(), productModel.getBuyPrice());
    }

    public List<Product> toProductList(List<ProductModel> productModels) {
        return productModels.stream().map(this::toProduct).collect(Collectors.toList());
    }
}

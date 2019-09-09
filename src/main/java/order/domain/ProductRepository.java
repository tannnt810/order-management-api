package order.domain;

import order.domain.entities.object.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAll();
    Product findByProductCode(String productCode);
}

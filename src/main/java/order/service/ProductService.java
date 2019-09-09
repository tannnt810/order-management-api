package order.service;

import order.domain.ProductRepository;
import order.domain.entities.object.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {

        return productRepository.getAll();
    }

    public Product findByProductCode(String productCode) {
        return productRepository.findByProductCode(productCode);
    }
}
package order.repository;

import order.domain.ProductRepository;
import order.domain.entities.object.Product;
import order.repository.factory.ProductFactory;
import order.repository.mapper.ProductMapper;
import order.repository.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ProductRepositoryImpl extends JdbcDaoSupport implements ProductRepository {

    private ProductMapper productMapper;
    private ProductFactory productFactory;

    @Autowired
    public ProductRepositoryImpl(DataSource dataSource, ProductMapper productMapper, ProductFactory productFactory) {
        this.setDataSource(dataSource);
        this.productMapper = productMapper;
        this.productFactory = productFactory;
    }

    public List<Product> getAll() {

        String sql = "SELECT * FROM products LIMIT 10";

        List<ProductModel> productModelList = this.getJdbcTemplate().query(sql, productMapper);

        return productFactory.toListProduct(productModelList);
    }

    public Product findByProductCode(String productCode) {

        String sql = "SELECT * " +
                "FROM products " +
                "WHERE productCode = ?";

        List<ProductModel> productModelList = this.getJdbcTemplate().query(sql, productMapper, productCode);

        return productFactory.toFirstProduct(productModelList);
    }
}
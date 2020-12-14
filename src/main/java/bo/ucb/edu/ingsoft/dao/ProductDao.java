package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.ProductGetId;
import bo.ucb.edu.ingsoft.model.Brand;
import bo.ucb.edu.ingsoft.model.Product;
import bo.ucb.edu.ingsoft.model.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDao {

    public void createProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(Product product);

    public List<ProductGetId>  getProductbyId(Integer productId);
}

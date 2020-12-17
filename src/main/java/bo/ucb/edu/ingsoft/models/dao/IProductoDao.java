package bo.ucb.edu.ingsoft.models.dao;


import bo.ucb.edu.ingsoft.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDao extends JpaRepository<Producto, Integer> {

}

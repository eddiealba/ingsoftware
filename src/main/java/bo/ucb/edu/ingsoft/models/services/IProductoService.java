package bo.ucb.edu.ingsoft.models.services;


import bo.ucb.edu.ingsoft.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();

    public Page<Producto> findAll(Pageable pageable);

    public Producto findById(int productId);

    public Producto save(Producto producto);

    public void  delete(int productId );

}

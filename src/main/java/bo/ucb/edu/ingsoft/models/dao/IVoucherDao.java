package bo.ucb.edu.ingsoft.models.dao;


import bo.ucb.edu.ingsoft.models.entity.Voucher;
import org.springframework.data.repository.CrudRepository;

public interface IVoucherDao extends CrudRepository<Voucher, Integer> {


}

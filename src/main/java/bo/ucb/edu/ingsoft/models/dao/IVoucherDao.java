package bo.ucb.edu.ingsoft.models.dao;


import bo.ucb.edu.ingsoft.models.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVoucherDao extends JpaRepository<Voucher, Integer> {


}

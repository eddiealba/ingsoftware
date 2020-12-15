package bo.ucb.edu.ingsoft.models.services;


import bo.ucb.edu.ingsoft.models.entity.Voucher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IVoucherService {
    public List<Voucher> findAll();

    public Page<Voucher> findAll(Pageable pageable);

    public Voucher findById(int voucherId);

    public Voucher save(Voucher voucher);

    public void  delete(int voucherId );

}

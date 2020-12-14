package bo.ucb.edu.ingsoft.models.services;


import bo.ucb.edu.ingsoft.models.entity.Voucher;

import java.util.List;

public interface IVoucherService {
    public List<Voucher> findAll();

    public Voucher findById(int voucherId);

    public Voucher save(Voucher voucher);

    public void  delete(int voucherId );

}

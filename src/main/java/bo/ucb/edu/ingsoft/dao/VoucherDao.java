package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.model.Voucher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VoucherDao {
    public void createVoucher(Voucher voucher);

    public void updateVoucher(Voucher voucher);

    public void deleteVoucher(Voucher voucher);

}

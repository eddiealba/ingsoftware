package bo.ucb.edu.ingsoft.models.services;

import bo.ucb.edu.ingsoft.models.dao.IVoucherDao;
import bo.ucb.edu.ingsoft.models.entity.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VoucherServiceImpl implements IVoucherService{

    @Autowired
    private IVoucherDao voucherDao;

    @Override
    @Transactional(readOnly = true)
    public List<Voucher> findAll() {
        return (List<Voucher>) voucherDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Voucher findById(int voucherId) {
        return voucherDao.findById(voucherId).orElse(null);
    }

    @Override
    @Transactional
    public Voucher save(Voucher voucher) {
        return voucherDao.save(voucher);
    }

    @Override
    @Transactional
    public void delete(int voucherId) {
        voucherDao.deleteById(voucherId);
    }
}

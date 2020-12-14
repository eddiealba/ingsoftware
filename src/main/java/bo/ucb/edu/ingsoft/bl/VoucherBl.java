package bo.ucb.edu.ingsoft.bl;


import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.VoucherDao;

import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.dto.VoucherAdd;
import bo.ucb.edu.ingsoft.dto.VoucherDelete;
import bo.ucb.edu.ingsoft.dto.VoucherUpdate;
import bo.ucb.edu.ingsoft.model.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoucherBl {
    private VoucherDao voucherDao;
    private TransactionDao transactionDao;

    @Autowired
    public VoucherBl(VoucherDao voucherDao, TransactionDao transactionDao){
        this.voucherDao = voucherDao;
        this.transactionDao = transactionDao;
    }

    public VoucherAdd createVoucher(VoucherAdd voucherAdd, Voucher voucher, Transaction transaction){
        voucher.setOrderId(voucherAdd.getOrderId());
        voucher.setPaymentId(voucherAdd.getPaymentId());
        voucher.setDate(voucherAdd.getDate());
        voucher.setTotal(voucherAdd.getTotal());
        voucher.setTxId(transaction.getTxId());
        voucher.setTxHost(transaction.getTxHost());
        voucher.setTxUserId(transaction.getTxUserId());
        voucher.setTxDate(transaction.getTxDate());
        voucherDao.createVoucher(voucher);
        Integer getLastId = transactionDao.getLastInsertId();
        voucher.setVoucherId(getLastId);

        return voucherAdd;
    }

    public VoucherDelete deleteVoucher(VoucherDelete voucherDelete, Transaction transaction, Voucher voucher, Integer voucherId){

        voucher.setTxStatus(voucherDelete.getTxStatus());
        voucher.setVoucherId(voucherId);
        voucher.setTxDate(transaction.getTxDate());
        voucher.setTxUserId(transaction.getTxUserId());
        voucher.setTxHost(transaction.getTxHost());
        voucher.setTxId(transaction.getTxId());
        voucherDao.deleteVoucher(voucher);

        return voucherDelete;
    }


    public VoucherUpdate updateVoucher(VoucherUpdate voucherUpdate, Transaction transaction, Voucher voucher, int voucherId) {
        voucher.setVoucherId(voucherId);
        voucher.setTxDate(transaction.getTxDate());
        voucher.setTxUserId(transaction.getTxUserId());
        voucher.setTxHost(transaction.getTxHost());
        voucher.setTxId(transaction.getTxId());
        voucher.setDate(voucherUpdate.getDate());
        voucher.setTotal(voucherUpdate.getTotal());
        voucherDao.updateVoucher(voucher);

        return voucherUpdate;
    }
}

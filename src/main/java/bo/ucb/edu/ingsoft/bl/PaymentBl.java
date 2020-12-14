package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.AddressDao;
import bo.ucb.edu.ingsoft.dao.PaymentDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.PaymentAdd;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.dto.UserCreate;
import bo.ucb.edu.ingsoft.model.Address;
import bo.ucb.edu.ingsoft.model.Payment;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentBl {

    private PaymentDao paymentDao;
    private TransactionDao transactionDao;


    @Autowired
    public PaymentBl(PaymentDao paymentDao, TransactionDao transactionDao) {
        this.paymentDao = paymentDao;
        this.transactionDao = transactionDao;
    }

    public PaymentAdd createPayment(PaymentAdd paymentAdd, Transaction transaction)
    {
        Payment payment = new Payment();
        payment.setFirstname(paymentAdd.getFirstname());
        payment.setLastname(paymentAdd.getLastname());
        payment.setCardNumber(paymentAdd.getCardNumber());
        payment.setSecurityCode(paymentAdd.getSecurityCode());
        payment.setDateExpire(paymentAdd.getDateExpire());
        payment.setTxId(transaction.getTxId());
        payment.setTxHost(transaction.getTxHost());
        payment.setTxUserId(transaction.getTxUserId());
        payment.setTxDate(transaction.getTxDate());
        paymentDao.createPayment(payment);
        payment.setPaymentId(transactionDao.getLastInsertId());


        return paymentAdd;
    }
}

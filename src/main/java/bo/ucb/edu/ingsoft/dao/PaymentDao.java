package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.PaymentAdd;
import bo.ucb.edu.ingsoft.model.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    public void createPayment(Payment payment);
}

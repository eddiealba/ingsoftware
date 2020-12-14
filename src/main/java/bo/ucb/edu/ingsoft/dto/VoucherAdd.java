package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class VoucherAdd {
    private Integer orderId;
    private Integer paymentId;
    private Date date;
    private BigDecimal total;



    public VoucherAdd(){

    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "VoucherAdd{" +
                "orderId='" + orderId + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", date=" + date +
                ", total='" + total + '\'' +
                '}';
    }
}

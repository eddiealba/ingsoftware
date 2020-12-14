package bo.ucb.edu.ingsoft.model;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class Voucher {
    private Integer voucherId;
    private Integer orderId;
    private Integer paymentId;
    private Date date;
    private BigDecimal total;
    private Integer txStatus;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;


    public Voucher(){

    }

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucherId) {
        this.voucherId = voucherId;
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

    public Integer getTxStatus() {
        return txStatus;
    }

    public void setTxStatus(Integer txStatus) {
        this.txStatus = txStatus;
    }


    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Integer getTxUserId() {
        return txUserId;
    }

    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "voucherId=" + voucherId +
                ", orderId='" + orderId + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", date=" + date +
                ", total='" + total + '\'' +
                ", txStatus=" + txStatus +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                '}';
    }
}

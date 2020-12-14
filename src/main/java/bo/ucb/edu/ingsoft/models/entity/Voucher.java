package bo.ucb.edu.ingsoft.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "voucher")
public class Voucher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voucherId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "payment_id")
    private Integer paymentId;

    private Date date;
    private BigDecimal total;

    @Column(name = "tx_status")
    private Integer txStatus;

    @Column(name = "tx_id")
    private Integer txId;

    @Column(name = "tx_host")
    private String txHost;

    @Column(name = "tx_user_id")
    private Integer txUserId;

    @Column(name = "tx_date")
    private Date txDate;

    @PrePersist
    public void prePersist(){
        date = new Date();
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

    private static final long serialVersionUID = 1L;
}

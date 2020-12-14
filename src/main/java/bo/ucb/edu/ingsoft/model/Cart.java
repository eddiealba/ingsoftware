package bo.ucb.edu.ingsoft.model;
import java.math.BigDecimal;
import java.util.Date;

public class Cart {
    private Integer cartId;
    private Boolean isActive;
    private BigDecimal total;
    private Integer txStatus;
    private Integer txId;
    private String txHost;
    private Integer TxUserId;
    private Date txDate;

    public Cart() {
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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
        return TxUserId;
    }

    public void setTxUserId(Integer txUserId) {
        TxUserId = txUserId;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", isActive=" + isActive +
                ", total=" + total +
                ", txStatus=" + txStatus +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", TxUserId=" + TxUserId +
                ", txDate=" + txDate +
                '}';
    }
}

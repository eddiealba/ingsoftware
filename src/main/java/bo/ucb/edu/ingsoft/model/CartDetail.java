package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class CartDetail {
    private Integer cartDetailId;
    private Integer cartId;
    private Integer productId;
    private Integer qtty;
    private Integer txStatus;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;

    public CartDetail() {
    }

    public Integer getCartDetailId() {
        return cartDetailId;
    }

    public void setCartDetailId(Integer cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQtty() {
        return qtty;
    }

    public void setQtty(Integer qtty) {
        this.qtty = qtty;
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
        return "CartDetail{" +
                "cartDetailId=" + cartDetailId +
                ", cartId=" + cartId +
                ", productId=" + productId +
                ", qtty=" + qtty +
                ", txStatus=" + txStatus +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                '}';
    }
}

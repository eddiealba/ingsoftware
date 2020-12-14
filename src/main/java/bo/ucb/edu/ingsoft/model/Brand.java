package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Brand {
    private Integer brandId;
    private String name;
    private Integer txStatus;
    private Integer txId;
    private String txHost;
    private Integer TxUserId;
    private Date txDate;
    public Brand(){

    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Brand{" +
                "brandId=" + brandId +
                ", name='" + name + '\'' +
                ", txStatus=" + txStatus +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", TxUserId=" + TxUserId +
                ", txDate=" + txDate +
                '}';
    }
}

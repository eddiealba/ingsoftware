package bo.ucb.edu.ingsoft.model;

import java.util.Date;

public class Tag {
    private Integer tagId;
    private Integer category;
    private Integer txStatus;
    private Integer txId;
    private String txHost;
    private Integer TxUserId;
    private Date txDate;
    public Tag(){

    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
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
        return "Tag{" +
                "tagId=" + tagId +
                ", category=" + category +
                ", txStatus=" + txStatus +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", TxUserId=" + TxUserId +
                ", txDate=" + txDate +
                '}';
    }
}

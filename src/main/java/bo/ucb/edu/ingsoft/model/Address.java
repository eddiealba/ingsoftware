package bo.ucb.edu.ingsoft.model;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Address {

    private Integer addressId;
    private Integer neighbourId;
    private String street;
    private String number;
    private String reference;
    private Integer txStatus;
    private Date txDate;
    private Integer txId;
    private String txHost;
    private Integer txUserId;

    public Address(){
    }

    public Integer getAddressId() {
        return addressId;
    }
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getNeighbourId() { return neighbourId; }
    public void setNeighbourId(Integer neighbourId) { this.neighbourId = neighbourId; }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Integer getTxStatus() {
        return txStatus;
    }
    public void setTxStatus(Integer txStatus) {
        this.txStatus = txStatus;
    }

    public Date getTxDate() {
        return txDate;
    }
    public void setTxDate(Date txDate) {
        this.txDate = txDate;
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

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", neighbourId=" + neighbourId +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", reference='" + reference + '\'' +
                ", txStatus=" + txStatus +
                ", txDate=" + txDate +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                '}';
    }
}

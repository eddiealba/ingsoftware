package bo.ucb.edu.ingsoft.model;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class User {

    private Integer userId;
    private Integer addressId;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String password;
    private Integer txStatus;
    private Date txDate;
    private Integer txId;
    private String txHost;
    private Integer txUserId;

    public User(){
    }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getAddressId() { return addressId; }
    public void setAddressId(Integer addressId) { this.addressId = addressId; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password;}
    public void setPassword(String password) { this.password = password; }

    public Integer getTxStatus() { return txStatus; }
    public void setTxStatus(Integer txStatus) { this.txStatus = txStatus; }

    public Date getTxDate() { return txDate; }
    public void setTxDate(Date txDate) { this.txDate = txDate; }

    public Integer getTxId() { return txId; }
    public void setTxId(Integer txId) { this.txId = txId; }

    public String getTxHost() { return txHost; }
    public void setTxHost(String txHost) { this.txHost = txHost; }

    public Integer getTxUserId() { return txUserId; }
    public void setTxUserId(Integer txUserId) { this.txUserId = txUserId; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", addressId=" + addressId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", txStatus=" + txStatus +
                ", txDate=" + txDate +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                '}';
    }
}

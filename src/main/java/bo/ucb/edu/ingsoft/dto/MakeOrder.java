package bo.ucb.edu.ingsoft.dto;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.Date;

public class MakeOrder {
    private Integer addressId;
    private Integer userId;
    private Integer cartId;
    private Integer deliveryId;
    private Date  date;
    private Integer status;
    private Integer state;

    public MakeOrder() {
    }


    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "MakeOrder{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", cartId=" + cartId +
                ", deliveryId=" + deliveryId +
                ", date=" + date +
                ", status=" + status +
                ", state=" + state +
                '}';
    }
}
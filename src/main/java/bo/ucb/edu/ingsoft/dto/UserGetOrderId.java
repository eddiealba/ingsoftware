package bo.ucb.edu.ingsoft.dto;

import java.math.BigDecimal;
import java.util.Date;

public class UserGetOrderId {

    private Integer orderId;
    private String productName;
    private String neighbour;
    private String street;
    private String number;
    private Date date;
    private Integer state;
    private BigDecimal total;

    public UserGetOrderId(){
    }

    public Integer getOrderId() { return orderId; }
    public void setOrderId(Integer orderId) { this.orderId = orderId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getNeighbour() { return neighbour; }
    public void setNeighbour(String neighbour) { this.neighbour = neighbour; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Integer getState() { return state; }
    public void setState(Integer state) { this.state = state; }

    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }

    @Override
    public String toString() {
        return "UserGetOrderId{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", neighbour='" + neighbour + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", state=" + state +
                ", total=" + total +
                '}';
    }
}

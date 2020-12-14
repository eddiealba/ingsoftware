package bo.ucb.edu.ingsoft.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer productId;
    private Integer brandId;
    private String productName;
    private Integer tagId;
    private String detail;
    private String model;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private Boolean storeAvailable;
    private Boolean deliveryAvailable;
    private String image;
    private Integer txStatus;
    private Integer txId;
    private String txHost;
    private Integer TxUserId;
    private Date txDate;
    public Product(){

    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStoreAvailable() {
        return storeAvailable;
    }

    public void setStoreAvailable(Boolean storeAvailable) {
        this.storeAvailable = storeAvailable;
    }

    public Boolean getDeliveryAvailable() {
        return deliveryAvailable;
    }

    public void setDeliveryAvailable(Boolean deliveryAvailable) {
        this.deliveryAvailable = deliveryAvailable;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        return "Product{" +
                "productId=" + productId +
                ", brandId=" + brandId +
                ", productName='" + productName + '\'' +
                ", tagId=" + tagId +
                ", detail='" + detail + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", storeAvailable=" + storeAvailable +
                ", deliveryAvailable=" + deliveryAvailable +
                ", image='" + image + '\'' +
                ", txStatus=" + txStatus +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", TxUserId=" + TxUserId +
                ", txDate=" + txDate +
                '}';
    }
}

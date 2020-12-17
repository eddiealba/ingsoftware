package bo.ucb.edu.ingsoft.models.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "product")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @NotEmpty
    @Column(name = "brand_id")
    private Integer brandId;

    @NotEmpty(message ="no puede estar vacio")
    @Column(unique = true)
    private String productName;

    @NotEmpty
    @Column(name = "tag_id")
    private Integer tagId;

    @NotEmpty(message ="no puede estar vacio")
    private String detail;

    @NotEmpty(message ="no puede estar vacio")
    private String model;

    @Column(nullable = false)
    @NotEmpty(message ="no puede estar vacio")
    @Size(max=12)
    private BigDecimal price;

    @NotEmpty
    private Integer stock;

    private String description;

    @Column(name = "store_available")
    @NotEmpty
    private Integer storeAvailable;

    @Column(name = "delivery_available")
    @NotEmpty
    private Integer deliveryAvailable;

    private String image;


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

    public Integer getProductId(){return  productId;}

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

    public Integer getStoreAvailable() {
        return storeAvailable;
    }

    public void setStoreAvailable(Integer storeAvailable) {
        this.storeAvailable = storeAvailable;
    }

    public Integer getDeliveryAvailable() {
        return deliveryAvailable;
    }

    public void setDeliveryAvailable(Integer deliveryAvailable) {
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

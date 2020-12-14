package bo.ucb.edu.ingsoft.dto;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductGetId {


    private String image;
    private Integer stock;
    private BigDecimal price;
    private String productName;
    public ProductGetId(){

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductGetId{" +
                "image='" + image + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}

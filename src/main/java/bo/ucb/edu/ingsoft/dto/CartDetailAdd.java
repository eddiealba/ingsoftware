package bo.ucb.edu.ingsoft.dto;

public class CartDetailAdd {
    private Integer cartId;
    private Integer productId;
    private Integer qtty;

    public CartDetailAdd() {
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

    @Override
    public String toString() {
        return "CartDetailAdd{" +
                "cartId=" + cartId +
                ", productId=" + productId +
                ", qtty=" + qtty +
                '}';
    }
}

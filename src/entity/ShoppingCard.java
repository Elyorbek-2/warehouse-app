package entity;

import java.util.UUID;

public class ShoppingCard {
    private UUID id;
    private Product product;
    private Integer qty;

    @Override
    public String toString() {
        return "ShoppingCard{" +
                "id=" + id +
                ", product=" + product +
                ", qty=" + qty +
                '}';
    }

    public ShoppingCard() {
    }

    public ShoppingCard(UUID id, Product product, Integer qty) {
        this.id = id;
        this.product = product;
        this.qty = qty;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}

package entity;

import java.util.Date;
import java.util.UUID;

public class IncomeProduct {
    private UUID id;
    private Product product;
    private Double price;
    private Date date;

    @Override
    public String toString() {
        return "IncomeProduct{" +
                "id=" + id +
                ", product=" + product +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public IncomeProduct() {
    }

    public IncomeProduct(UUID id, Product product, Double price, Date date) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.date = date;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

package entity;

import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID id;
    private User user;
    private Date date;
    private String status;
    private Double totalPrice;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public Order() {
    }

    public Order(UUID id, User user, Date date, String status, Double totalPrice) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

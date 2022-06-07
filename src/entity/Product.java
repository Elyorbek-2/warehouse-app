package entity;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private Measurement measurement;
    private Category category;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", measurement=" + measurement +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public Product() {
    }

    public Product(UUID id, String name, Measurement measurement, Category category, double price) {
        this.id = id;
        this.name = name;
        this.measurement = measurement;
        this.category = category;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package entity;

import java.util.UUID;

public class Category {
    private UUID uuid;
    private String categoryName;
    private Category categoryId;

    @Override
    public String toString() {
        return "Category{" +
                "uuid=" + uuid +
                ", categoryName='" + categoryName + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }

    public Category() {
    }

    public Category(UUID uuid, String categoryName, Category categoryId) {
        this.uuid = uuid;
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }
}

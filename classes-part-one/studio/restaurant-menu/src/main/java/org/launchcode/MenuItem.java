package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean newItem) {
        this.isNew = isNew;
    }

    public MenuItem(String name, Double price, String description, String category, Boolean isNew) {
        this.name =name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }



}

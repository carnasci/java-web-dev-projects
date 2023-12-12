package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    public void printMenuItem(){
       System.out.println(this.toString());
    }
    @Override
    public String toString(){
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" + description + " |$" + price;
    }

    public MenuItem(String n, double p, String d, String c) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.dateAdded = LocalDate.now();
    }

    public void setPrice(double price) {
        this.price = price;
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
    public String getName() {
        return name;
    }


    public LocalDate getDateAdded() {
        return dateAdded;
    }
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null || this.getClass() != getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.name.equals(otherItem.getName());
    }

}



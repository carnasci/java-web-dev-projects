package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private ArrayList<MenuItem> foodItem;
    private Date lastUpdated;

    public Menu(String name, ArrayList<MenuItem> foodItem, Date lastUpdated){
        this.name = name;
        this.foodItem = foodItem;
        this.lastUpdated = lastUpdated;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(ArrayList<MenuItem> foodItem) {
        this.foodItem = foodItem;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}

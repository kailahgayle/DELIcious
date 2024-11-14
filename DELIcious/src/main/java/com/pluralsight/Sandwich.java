package com.pluralsight;

import java.util.List;

public class Sandwich {
    private String size;
    private String breadType;
    private List<String> meats;
    private List<String> cheeses;
    private List<String> toppings;
    private List<String> sauces;
    private boolean toasted;

    public Sandwich(String size, String breadType, List<String> meats, List<String> cheeses, List<String> toppings, List<String> sauces, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.meats = meats;
        this.cheeses = cheeses;
        this.toppings = toppings;
        this.sauces = sauces;
        this.toasted = toasted;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<String> getMeats() {
        return meats;
    }

    public void setMeats(List<String> meats) {
        this.meats = meats;
    }

    public List<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<String> cheeses) {
        this.cheeses = cheeses;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    // This method will calculate the price of the sandwich
    public double calculatePrice() {
        double price = 0.0;
        //based on sandwich size
        switch (size) {
            case "4":
                price += 5.50;
                break;
            case "8":
                price += 7.00;
                break;
            case "12":
                price += 8.50;
                break;
        }
        return price;
        // Add prices for meats
    }
}

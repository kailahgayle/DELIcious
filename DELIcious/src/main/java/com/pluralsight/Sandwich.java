package com.pluralsight;

import java.util.List;


public class Sandwich implements OrderItem {

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

    // Where we would calculate the price based on size, toppings, and extras

    @Override

    public double calculatePrice() {
        double price = 0.0;
        // Base price
        if (size.equals("4\"")) {
            price += 5.50;
        } else if (size.equals("8\"")) {
            price += 7.00;
        } else if (size.equals("12\"")) {
            price += 8.50;
        }

        // Additionl costs for meats, cheeses, toppings, and if its toasted
        price += meats.size() * 1.00;
        price += cheeses.size() * 0.75;
        price += toppings.size() * 0.50;
        price += sauces.size() * 0.25;
        if (toasted) {
            price += 0.50;
        }
        return price;
    }

    @Override

    public void displayDetails() {
        System.out.println("Sandwich - Size: " + size + ", Bread: " + breadType);
        System.out.println("Meats: " + String.join(", ", meats));
        System.out.println("Cheeses: " + String.join(", ", cheeses));
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println("Sauces: " + String.join(", ", sauces));
        System.out.println("Toasted: " + (toasted ? "Yes" : "No"));
        System.out.println("Price: $" + calculatePrice());
    }

}
package com.pluralsight;

import java.util.List;



public class Sandwich extends OrderItem {

    private String size; // "4", "8", "12"
    private String breadType; // white, wheat, rye, wrap
    private List<String> meats; // Regular meats:  steak, ham, salami, roast beef, chicken, bacon
    private List<String> extraMeats; // Extra meats with additional cost
    private List<String> cheeses; //  american, provolone, cheddar, swiss
    private List<String> toppings; // Regular toppings lettuce, tomatoes, etc.
    private List<String> sauces; //ketchup,ranch,thousand islands,vinaigrette
    private List<String> sides; // au jus, sauce
    private boolean toasted; // true if toasted

    // Constructor
    public Sandwich(String size, String breadType, List<String> meats, List<String> extraMeats, List<String> cheeses, List<String> toppings, List<String> sauces, List<String> sides,boolean toasted, double price) {
        super(size,price);

        this.size = size;
        this.breadType = breadType;
        this.meats = meats;
        this.extraMeats = extraMeats;
        this.cheeses = cheeses;
        this.toppings = toppings;
        this.sauces = sauces;
        this.sides = sides;
        this.toasted = toasted;
        this.price = price;
    }

    // Getters and Setters

    public String getSize() {
        return size; }
    public void setSize(String size) {
        this.size = size; }

    public List<String> getMeats() {
        return meats; }
    public void setMeats(List<String> meats) {
        this.meats = meats; }
    public List<String> getExtraMeats() {
        return extraMeats; }
    public void setExtraMeats(List<String> extraMeats) {
        this.extraMeats = extraMeats; }
    public List<String> getCheeses() {
        return cheeses; }
    public void setCheeses(List<String> cheeses) {
        this.cheeses = cheeses; }
    public List<String> getToppings() {
        return toppings; }
    public void setToppings(List<String> toppings) {
        this.toppings = toppings; }
    public List<String> getSauces() {
        return sauces; }
    public void setSauces(List<String> sauces) {
        this.sauces = sauces; }
    public List<String> getSides() {
        return sides;
    }
    public void setSides(List<String> sides) {
        this.sides = sides;
    }
    public boolean isToasted() {
        return toasted; }
    public void setToasted(boolean toasted) {
        this.toasted = toasted; }



    // Calculate Price based on size, extra meats, and toppings they select

    public double calculatePrice() {
        double basePrice = 0.0;


        // Base prices
        switch (size) {
            case "4":
                basePrice = 5.50;
                break;

            case "8":
                basePrice = 7.00;
                break;


            case "12":
                basePrice = 8.50;
                break;
        }



        // Addtnl costs
        basePrice += meats.size() * (size.equals("4") ? 1.00 : size.equals("8") ? 2.00 : 3.00);



        // Adding cost for extra meats
        double extraMeatPrice = size.equals("4") ? 0.50 : size.equals("8") ? 1.00 : 1.50;
        basePrice += extraMeats.size() * extraMeatPrice;



        // Adding cost for cheeses
        basePrice += cheeses.size() * 0.75;



        // Return final price
        return basePrice;

    }



    // Display sandwich details
    public void displayDetails() {

        System.out.println("Size: " + size + "\"");
        System.out.println("Bread Type: " + breadType);
        System.out.println("Toasted: " + (toasted ? "Yes" : "No"));
        System.out.println("Meats: " + String.join(", ", meats));
        System.out.println("Extra Meats: " + String.join(", ", extraMeats));
        System.out.println("Cheeses: " + String.join(", ", cheeses));
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println("Sauces: " + String.join(", ", sauces));
        System.out.println("Price: $" + calculatePrice());

    }

}
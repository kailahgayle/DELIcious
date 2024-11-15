package com.pluralsight;

public class Drink extends OrderItem {

    private String size;   // Small, Medium, Large

    private String flavor;

    private double price;



    // Constructor
    public Drink(String size, String flavor, double price) {
        super(size, price);
        this.size = size;
        this.flavor = flavor;
        this.price = price;
    }


    // Getters and Setters
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }



    // Method to calculate price
    public double calculatePrice() {
        return price;
    }



    // Display details of the drink (op)
    public void displayDetails() {
        System.out.println("Drink");
        System.out.println(size + " " + flavor + ": $" + price);
    }
}

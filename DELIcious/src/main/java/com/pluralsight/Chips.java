package com.pluralsight;

public class Chips extends OrderItem {
    private double price;

    // Constructor
    public Chips(String size, double price) {
        super(size, price);
        this.price = price;
    }

    // Getter and Setter
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }



    // Method to calculate price if needed

    public double calculatePrice() {

        return price;

    }




    //for display
    public void displayDetails() {
        System.out.println("Chips");
        System.out.println("Price: $"+price);
    }
}

package com.pluralsight;

public class Chips {
    private final double price = 1.50;

    public double getPrice() {
        return price;
    }

    //for display
    public void displayDetails() {
        System.out.println("Chips");
        System.out.println("Price: $"+price);
    }
}

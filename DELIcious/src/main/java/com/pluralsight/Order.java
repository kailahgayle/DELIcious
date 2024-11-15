package com.pluralsight;

import java.util.ArrayList;

import java.util.List;



public class Order {

    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;



    // Constructor
    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
    }



    // Add items to order
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
    public void addChips(Chips chip) {
        chips.add(chip);
    }



    // Calculate total price of order
    public double calculateTotal() {
        double total = 0;
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.calculatePrice();
        }
        for (Drink drink : drinks) {
            total += drink.calculatePrice();
        }
        for (Chips chip : chips) {
            total += chip.calculatePrice();
        }
        return total;
    }

    // Display details of the order
    public void displayOrder() {
        System.out.println("\n===== Your Order Details =====");
        System.out.println("Sandwiches:");
        if (!sandwiches.isEmpty()) {
            System.out.println("Sandwiches");
            for (Sandwich sandwich : sandwiches) {
                sandwich.displayDetails();
            }
        }

        if (!drinks.isEmpty()) {
            System.out.println("Drinks:");
            for (Drink drink : drinks) {
                drink.displayDetails();
            }
        }

        if (!chips.isEmpty()) {
            System.out.println("Chips:");
            for (Chips chip : chips) {
                chip.displayDetails();
            }
        }

        System.out.println("Total Cost: $" + calculateTotal());
    }

}
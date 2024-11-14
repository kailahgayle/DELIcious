package com.pluralsight;

import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }
    //add items to the order
        public void addSanwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
    public void addChips(Chips chip) {
        chips.add(chip);
    }
    //calculate cost
    public double calculateTotal() {
        double total = 0.0;

        //adds sandwich prices
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.calculatePrice();
        }
        //adds drink prices
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        //adds chip prices
        for (Chips chip : chips) {
            total += chip.getPrice();
        }
        return total;
    }

    //show the order+details
    public void printOrderDetails() {
        System.out.println("\n--- Your Order Details ---");
        System.out.println("Sandwiches:");
        for (Sandwich sandwich : sandwiches) {
            //sandwich.displayDetails();
        }

        System.out.println("Drinks:");
        for (Drink drink : drinks) {
           // drink.displayDetails();
        }
        System.out.println("Chips");
        for (Chips chip : chips) {
            chip.displayDetails();
        }
        System.out.println("Total Cost: $"+calculateTotal());
    }
}

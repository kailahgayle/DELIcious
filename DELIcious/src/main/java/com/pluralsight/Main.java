package com.pluralsight;



import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class Main {

    private static Order currentOrder = new Order();



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.println("======= WELCOME TO OUR DELI-CIOUS DELI =======");

            System.out.println("1) New Order");

            System.out.println("0) Exit");

            System.out.print("Enter your choice: ");



            int choice = scanner.nextInt();

            scanner.nextLine();



            switch (choice) {

                case 1:

                    System.out.println("Starting new order...");

                    startNewOrder(scanner);

                    break;



                case 0:

                    System.out.println("Thank you for visiting! See you next time.");

                    scanner.close();

                    return; // Exit the program



                default:

                    System.out.println("Invalid option. Please enter '1' to start a new order or '0' to exit.");

            }

            if (choice == 0) {

                break;

            }

        }

        scanner.close();

    }



    public static void startNewOrder(Scanner scanner) {

        System.out.println("Order Screen Loading...");

        showOrderScreen(scanner);

    }



    public static void showOrderScreen(Scanner scanner) {

        while (true) {

            System.out.println("====== Order Screen - Select an Option ======");

            System.out.println("1) Add Sandwich");

            System.out.println("2) Add Drink");

            System.out.println("3) Add Chips");

            System.out.println("4) Checkout");

            System.out.println("0) Cancel Order and go back to Home Screen");



            int choice = scanner.nextInt();

            scanner.nextLine(); // newline



            switch (choice) {

                case 1:

                    System.out.println("Adding a sandwich...");

                    addSandwich(scanner);

                    break;



                case 2:

                    System.out.println("Adding a drink...");

                    addDrink(scanner);

                    break;



                case 3:

                    System.out.println("Adding chips...");

                    addChips(scanner);

                    break;



                case 4:

                    System.out.println("Checking out...");

                    checkout();

                    return; // Go back to Home Screen after checkout



                case 0:

                    System.out.println("Oh no! Order canceled. Returning to Home Screen...");

                    return; // Exit to Home Screen



                default:

                    System.out.println("WHOOPS! Invalid option. Please select a valid option.");

            }

        }

    }



    public static void addSandwich(Scanner scanner) {

        System.out.println("Creating a new sandwich...");



        // Bread Type

        System.out.println("Select Bread Type:");

        System.out.println("1) White");

        System.out.println("2) Wheat");

        System.out.println("3) Rye");

        System.out.println("4) Wrap");

        System.out.print("Enter your choice: ");



        int breadChoice = scanner.nextInt();

        scanner.nextLine();

        String breadType = switch (breadChoice) {

            case 1 -> "White";

            case 2 -> "Wheat";

            case 3 -> "Rye";

            case 4 -> "Wrap";

            default -> "White";

        };



        // Sandwich Size

        System.out.println("Select Size:");

        System.out.println("1) 4\"");

        System.out.println("2) 8\"");

        System.out.println("3) 12\"");

        System.out.print("Enter your choice: ");



        int sizeChoice = scanner.nextInt();

        scanner.nextLine();

        String size = switch (sizeChoice) {

            case 1 -> "4";

            case 2 -> "8";

            case 3 -> "12";

            default -> "4";  // Default size

        };



        // Meats

        List<String> meats = new ArrayList<>();

        System.out.println("Input Meat(s) Separately (e.g., Steak, Ham) (Type 'done' to finish):");

        while (true) {

            String meat = scanner.nextLine();

            if (meat.equalsIgnoreCase("done")) break;

            meats.add(meat);

        }



        // Extra Meats

        List<String> extraMeats = new ArrayList<>();

        System.out.println("If you would like Extra Meat(s), Input Below. (Type 'done' to finish):");

        while (true) {

            String extraMeat = scanner.nextLine();

            if (extraMeat.equalsIgnoreCase("done")) break;

            extraMeats.add(extraMeat);

        }



        // Cheeses

        List<String> cheeses = new ArrayList<>();

        System.out.println("Input Cheese(s) Separately (e.g., American, Provolone) (Type 'done' to finish):");

        while (true) {

            String cheese = scanner.nextLine();

            if (cheese.equalsIgnoreCase("done")) break;

            cheeses.add(cheese);

        }



        // Toppings

        List<String> toppings = new ArrayList<>();

        System.out.println("Input Toppings (e.g., Lettuce, Tomato) (Type 'done' to finish):");

        while (true) {

            String topping = scanner.nextLine();

            if (topping.equalsIgnoreCase("done")) break;

            toppings.add(topping);

        }



        // Sauces

        List<String> sauces = new ArrayList<>();

        System.out.println("Input Sauce(s) (e.g., Mayo, Mustard) (Type 'done' to finish):");

        while (true) {

            String sauce = scanner.nextLine();

            if (sauce.equalsIgnoreCase("done")) break;

            sauces.add(sauce);

        }



        // Toasted Option

        System.out.print("Would you like your sandwich toasted? (yes/no): ");

        boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");



        // Price (For now, you can set a default or calculate based on the sandwich size and extras)

        double price = 8.0; // Example base price, update based on requirements



        // Create Sandwich object and add to the order

        Sandwich sandwich = new Sandwich(size, breadType, meats, extraMeats, cheeses, toppings, sauces, toasted, price);

        currentOrder.addSandwich(sandwich);

        System.out.println("Sandwich added to order!");

    }



    public static void addDrink(Scanner scanner) {

        System.out.println("Enter Drink Type (ex: Cola, Lemonade etc.: ");

        String type = scanner.nextLine();



        System.out.println("Select Drink Size:");

        System.out.println("1) Small");

        System.out.println("2) Medium");

        System.out.println("3) Large");

        System.out.print("Enter your choice: ");

        int sizeChoice = scanner.nextInt();

        scanner.nextLine();



        String size = switch (sizeChoice) {

            case 1 -> "Small";

            case 2 -> "Medium";

            case 3 -> "Large";

            default -> "Medium";

        };



        double price = switch (size) {

            case "Small" -> 2.0;

            case "Medium" -> 2.5;

            case "Large" -> 3.0;

            default -> 2.5;

        };



        Drink drink = new Drink(size, type, price);

        currentOrder.addDrink(drink);

        System.out.println("Drink added to order!");

    }



    public static void addChips(Scanner scanner) {

        System.out.println("Enter Chips Type ( Regular, BBQ, Salt & Vinegar): ");

        String type = scanner.nextLine();

        double price = 1.5;
        Chips chips = new Chips(type, price);
        currentOrder.addChips(chips);
        System.out.println("Chips added to order!");

    }



    public static void checkout() {

        System.out.println("Here's your Order.. Enjoy!");

        currentOrder.displayOrder();

    }

}
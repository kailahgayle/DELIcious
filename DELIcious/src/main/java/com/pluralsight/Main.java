package com.pluralsight;


import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.println("======WELCOME TO OUR DELI-CIOUS DELI======");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            int choice = scanner.nextInt();

            scanner.nextLine(); // Newline



            switch (choice) {
                case 1:
                    System.out.println("Starting new order...");
                    startNewOrder(scanner); // Placeholder
                    break;

                case 0:
                    System.out.println("======THANK YOU, SEE YOU NEXT TIME!======");
                    break; // will exit loop

                default:
                    System.out.println("Invalid option. Please enter '1' to start a new order or '0' to exit.");
            }

            if (choice == 0) {
                break; // Exits the loop when the user selects "0"
            }
        }



        scanner.close();
    }


    public static void startNewOrder(Scanner scanner) {
        System.out.println("Order Screen Loading...");
        // for order screen
    }
    public static void showOrderScreen(Scanner scanner) {

        while (true) {

            System.out.println("\nOrder Screen - Select an option:");

            System.out.println("1) Add Sandwich");

            System.out.println("2) Add Drink");

            System.out.println("3) Add Chips");

            System.out.println("4) Checkout");

            System.out.println("0) Cancel Order and go back to Home Screen");



            int choice = scanner.nextInt();

            scanner.nextLine(); // newln



            switch (choice) {
                case 1:
                    System.out.println("Adding a sandwich...");
                    addSandwich(scanner); // for adding a sandwich
                    break;

                case 2:
                    System.out.println("Adding a drink...");
                    addDrink(scanner); // for adding a drink
                    break;

                case 3:
                    System.out.println("Adding chips...");
                    addChips(scanner); // for adding chips
                    break;

                case 4:
                    System.out.println("Checking  out...");

                    checkout(); // for checkout

                    return; // Go back to Home Screen after checkout

                case 0:
                    System.out.println("Oh no! Order canceled. Returning to Home Screen...");
                    return; // Exit to Home Screen

                default:
                    System.out.println("WHOOPS! Invalid option. Please select a valid option.");
            }
        }

    }



// Placeholder

    public static void addSandwich(Scanner scanner) {
        System.out.println("Sandwich customization");
    }



    public static void addDrink(Scanner scanner) {
        System.out.println("Drink customization");
    }



    public static void addChips(Scanner scanner) {
        System.out.println("Chips selection");
    }



    public static void checkout() {
        System.out.println("Here's your Order.. Enjoy!");
    }

}
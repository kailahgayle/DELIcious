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
}
package com.pluralsight;


import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showHomeScreen(scanner);//Where home screen starts
    }

    //Home Screen Options
    private static void showHomeScreen(Scanner scanner) {
        while (true) { //make sure app stays open until user exits
            System.out.println("-------- WELCOME TO OUR DELI --------");
            System.out.println("N) New Order");
            System.out.println("X) Exit");
            System.out.println("Please Enter a Choice: ");

            // Prompt for user input
            String choice = scanner.nextLine().toUpperCase();

            //Results after user input
            switch (choice) {
                case "N":
                    //startNewOrder(scanner);
                    break;
                case "X":
                    System.out.println("Exiting..");
                    scanner.close();
                    return; //this will exit program
                default:
                    System.out.println("Invalid option. Please try Again.");
                    break; // this added scanner would let you stay in home screen if it's an invalid option

            }
        }
    }

   /* private static void startNewOrder(Scanner scanner) {

     Method for N)New Order
        Order order = new Order();
        showOrderScreen(scanner, order);
    }

    */
}
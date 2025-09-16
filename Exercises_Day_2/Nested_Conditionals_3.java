package Exercises_Day_2;

import java.util.Scanner;

public class Nested_Conditionals_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input amount
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();

        // Input current hour
        System.out.print("Current time (hour): ");
        int hour = scanner.nextInt();

        // Nested conditionals to determine discount
        if (hour >= 20 && hour <= 22) {
            // Happy hour: 8pm to 10pm inclusive
            double discounted = amount / 2;
            System.out.println("Promotion! Total to pay: " + discounted);
        } else if (hour >= 8 && hour <= 19) {
            // Regular hours: 8am to 7pm inclusive
            System.out.println("Total to pay: " + amount);
        } else {
            // Outside store hours
            System.out.println("The store is closed!");
        }

        scanner.close();
    }
}


// Nested Conditionals Happy hour discount

// Instructions The supermarket asked to change their program with a special happy hour offer: 1. If a purchase is made between 8 pm to 10 pm inclusive, then the promotion is triggered and the amount to be paid is halved. 2. If a purchase is made between 8 am to 7 pm inclusive, then there is no promotion. The program should print: "Total to pay:" and the grand total. 3. When you input at any other time, you cannot buy goods, the program should print: "The store is closed!"

// Expected output

// example 1 Amount: >>>2000

// Current time (hour): >>>20 Promotion! Total to pay: 1000.0

// Expected output

// example 2 Amount: >>>2000 Current time (hour): >>>12 Total to pay: 2000
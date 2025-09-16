package Exercises_Day_2;

import java.util.Scanner;

public class Nested_Conditionals_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input prices
        System.out.print("Price of product 1: ");
        int price1 = scanner.nextInt();

        System.out.print("Price of product 2: ");
        int price2 = scanner.nextInt();

        System.out.print("Price of product 3: ");
        int price3 = scanner.nextInt();

        int maxPrice;

        // Nested conditionals to find the highest price
        if (price1 >= price2) {
            if (price1 >= price3) {
                maxPrice = price1;
            } else {
                maxPrice = price3;
            }
        } else {
            if (price2 >= price3) {
                maxPrice = price2;
            } else {
                maxPrice = price3;
            }
        }

        // Output the promotion result
        System.out.println("Promotion! Total for three items: " + maxPrice);

        scanner.close();
    }
}


// Nested Conditionals 3=1 promotion

// Instructions The supermarket has launched the "1=3" promotion. The buyer can purchase any three goods, pay for the most expensive of them, and receive the others as a gift. Write a program that determines the highest price out of three and prints the amount to pay.

// Expected output

// example 1 Price of product 1: >>>1220 Price of product 2: >>>2100 Price of product 3: >>>140 Promotion! Total for three items: 2100

// Expected output

// example 2 Price of product 1: >>>1220 Price of product 2: >>>350 Price of product 3: >>>1220 Promotion! Total for three items: 1220
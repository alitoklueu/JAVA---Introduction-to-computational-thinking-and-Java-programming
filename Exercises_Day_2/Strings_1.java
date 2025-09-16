package Exercises_Day_2;

import java.util.Scanner;

public class Strings_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for review
        System.out.print("Leave a travel review: ");
        String review = scanner.nextLine();

        // Calculate length
        int length = review.length();

        // Output result
        System.out.println("Thanks for the review! It is " + length + " characters long.");

        scanner.close();
    }
}


// Strings Calculate the length of a String

// Instructions Write a program to request the customer for a review, thank them and print the length of their review.

// Expected output Leave a travel review: >>>Cool! Thanks for the review! It is 5 characters long.
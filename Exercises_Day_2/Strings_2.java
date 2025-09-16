package Exercises_Day_2;

import java.util.Scanner;

public class Strings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your favorite dishes: ");
        String input = scanner.nextLine().toLowerCase(); // Normalize to lowercase

        // Search for keywords
        boolean hasCake = input.contains("chocolate cake");
        boolean hasBarbecue = input.contains("barbecue");

        // Output results
        System.out.println("chocolate cake: " + (hasCake ? "found" : "not found"));
        System.out.println("barbecue: " + (hasBarbecue ? "found" : "not found"));

        scanner.close();
    }
}


// Strings Search for words in Strings

// Instructions The owner of a restaurant is interested in whether clients like their specialties: chocolate cake and barbecue. Write a program that asks the user for the dishes they like and prints the search result: Take into account that the client’s review might include uppercase and lowercase letters.

// Expected output Enter your favorite dishes: >>>barbecue, burger, pizza chocolate cake: not found barbecue: found
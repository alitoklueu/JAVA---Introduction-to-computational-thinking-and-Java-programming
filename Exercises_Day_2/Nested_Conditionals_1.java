package Exercises_Day_2;

import java.util.Scanner;

public class Nested_Conditionals_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like promotional items (yes/no)? ");
        String response = scanner.nextLine().trim().toLowerCase();

        if (response.equals("yes")) {
            System.out.print("Enter a category: ");
            String category = scanner.nextLine().trim().toLowerCase();

            if (category.equals("sweets")) {
                System.out.println("Gummy fruit for 200 coins");
            } else {
                System.out.println("Lingonberry juice for 140 coins");
            }
        } else {
            System.out.println("Let us know if you change your mind!");
        }

        scanner.close();
    }
}


// Nested Conditionals Promotional products

// Instructions The program recommends products in the promotion. If the buyer wants a recommendation, the program asks for a category of goods. - if the category is "sweets," "Gummy fruit for 200 coins" is recommended; - for any other category, "Lingonberry juice for 140 coins." If the buyer does not want any products in the promotion, the program politely says goodbye: "Let us know if you change your mind!"

// Expected output Would you like promotional items (yes/no)?

// example 1 >>>yes Enter a category: >>>sweets Gummy fruit for 200 coins

// Expected output

// example 2 Would you like promotional items (yes/no)? >>>no Let us know if you change your mind!
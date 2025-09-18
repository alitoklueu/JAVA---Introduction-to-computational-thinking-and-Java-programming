package Exercises_Day_3;

import java.util.Scanner;

public class While_4 {
    public static void main(String_1[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int greatest = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter any number: >>> ");
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number > greatest) {
                greatest = number;
            }
        }

        if (greatest == Integer.MIN_VALUE) {
            System.out.println("No valid number was entered.");
        } else {
            System.out.println("The greatest number was " + greatest);
        }

        scanner.close();
    }
}

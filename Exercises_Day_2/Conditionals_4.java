package Exercises_Day_2;

import java.util.Scanner;

public class Conditionals_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: >>>");
        int first = input.nextInt();

        System.out.print("Enter the second number: >>>");
        int second = input.nextInt();

        if (first == second) {
            System.out.println("The numbers are equal.");
        } else if (first > second) {
            System.out.println("The first number is greater.");
        } else {
            System.out.println("The second number is greater.");
        }
        input.close();
    }
}

// Conditionals Comparing numbers

// Instructions Request the user to input two numbers. If they are equal, print "The numbers are equal." If the first number is greater than the second, print "The first number is greater." Otherwise, print "The second number is greater.”

// Expected output

// example 1 Enter the first number: >>>15 Enter the second number: >>>33 The second number is greater.

// Expected output

// example 2 Enter the first number: >>>23 Enter the second number: >>>23 The numbers are equal.
package Exercises_Day_2;

import java.util.Scanner;

public class Conditionals_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How old are you? >>>");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Welcome to the club!");
        }
        input.close();
    }
}


// Conditionals Entering a club

// Instructions Request the user’s age. If they’re 18 or older, print "Welcome to the club!”

// Expected output

// example 1 How old are you? >>>25 Welcome to the club!

// Expected output

// example 2 How old are you? >>>13
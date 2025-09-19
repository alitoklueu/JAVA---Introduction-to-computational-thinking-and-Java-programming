package Exercises_Day_5;

import java.util.Scanner;

public class ternary_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: >>> ");
        int number1   = scanner.nextInt();
        System.out.println("Enter number 2: >>> ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;  
        int positiveSum = (sum < 0) ? -sum : sum;

        System.out.println("The positive sum of " + number1 + " and " + number2 + " is " + positiveSum);
        scanner.close();
    }
}

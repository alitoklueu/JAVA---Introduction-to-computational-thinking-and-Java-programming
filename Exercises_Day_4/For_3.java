package Exercises_Day_4;

import java.util.Scanner;

public class For_3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: >>>");
        int number = Integer.parseInt(scanner.nextLine());

        long factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);

        scanner.close();
    }
}

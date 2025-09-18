package Exercises_Day_3;

import java.util.Scanner;

public class While_2 {
    public static void main(String_1[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "password123";
        String input;

        while (true) {
            System.out.print("Enter the password: >>>");
            input = scanner.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Password correct!");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
        scanner.close();
    }
}

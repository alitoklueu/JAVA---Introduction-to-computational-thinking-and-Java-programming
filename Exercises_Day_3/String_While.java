package Exercises_Day_3;

import java.util.Scanner;

public class String_While {
    public static void main(String_1[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        

        while (true) {
            System.out.println("Enter a word starting with A: >>> ");
            input = scanner.nextLine();

            if (input.toUpperCase().contains("A")) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect!");
            }            
        }
        scanner.close();
    }
}

package Exercises_Day_3;

import java.util.Scanner;

public class While_3 {
    public static void main(String_1[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 101);
        int input;

        while (true) {
            System.out.print("Guess the number (1-100) ");
            input = scanner.nextInt();

            if (input==randomNum) {
                System.out.println("Congratulations! You guessed the number!");
                break;
            } else {
                if (input>randomNum) {
                    System.out.println("Too high. Try again.");                    
                } else {
                    System.out.println("Too low. Try again.");  
                }
            }
        }
        scanner.close();
    }
}

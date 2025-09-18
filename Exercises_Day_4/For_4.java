package Exercises_Day_4;

import java.util.Scanner;

public class For_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: >>>");
        int terms = Integer.parseInt(scanner.nextLine());

        int first = 0, second = 1;

        System.out.print("The Fibonacci sequence of " + terms + " terms is ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        scanner.close();
    }
}

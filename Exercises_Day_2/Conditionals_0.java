package Exercises_Day_2;

import java.util.Scanner;

public class Conditionals_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What day of the week is it? ");
        String day = scanner.nextLine().trim().toLowerCase();

        if (day.equals("tuesday")) {
            System.out.println("We go to school");
        } else {
            System.out.println("Enjoy your day off!");
        }

        scanner.close();
    }
}

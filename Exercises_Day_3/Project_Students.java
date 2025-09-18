package Exercises_Day_3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Project_Students {
    public static void main(String_1[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthDate;

        while (true) {
            System.out.print("Enter birth year (YYYY): ");
            int year = scanner.nextInt();

            if (year > LocalDate.now().getYear()) {
                System.out.println("You entered a future year. Please try again.");
                continue;
            }

            System.out.print("Enter birth month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter birth day (1-31): ");
            int day = scanner.nextInt();

            try {
                birthDate = LocalDate.of(year, month, day);
                if (birthDate.isAfter(LocalDate.now())) {
                    System.out.println("You entered a future date. Please try again.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid date entered. Please try again.");
            }
        }

        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);

        String monthName = birthDate.getMonth().getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.ENGLISH);

        System.out.println("Date of birth: " + birthDate.getDayOfMonth() + " " + monthName + " " + birthDate.getYear());
        System.out.println("Age: " + age.getYears());
        scanner.close();
    }
}

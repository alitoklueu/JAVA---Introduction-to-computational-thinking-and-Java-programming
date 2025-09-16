package Exercises_Day_2;

import java.time.LocalDate;
import java.util.Scanner;

public class Project_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect student details
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter birthday (day of month): ");
        int day = scanner.nextInt();

        System.out.print("Enter birth month: ");
        int month = scanner.nextInt();

        System.out.print("Enter birth year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter course registered: ");
        String course = scanner.nextLine();

        // Get current year
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();

        // Calculate age (simplified: ignoring month/day)
        int age = currentYear - year;

        // Display student info
        System.out.println("\nStudent Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
        System.out.println("Age: " + age);
        System.out.println("Course Registered: " + course);

        scanner.close();
    }
}

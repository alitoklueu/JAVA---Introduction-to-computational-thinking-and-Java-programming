package Exercises_Day_4;

import java.time.Year;
import java.util.Scanner;

public class Project_Students_Step_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = Year.now().getValue();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter birthday (day of month): ");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter birth month: ");
        int month = Integer.parseInt(scanner.nextLine());

        int year;
        while (true) {
            System.out.print("Enter birth year: ");
            year = Integer.parseInt(scanner.nextLine());
            if (year > currentYear) {
                System.out.println("The birth year cannot be in the future, please enter a valid birth year:");
            } else {
                break;
            }
        }

        System.out.print("Enter course registered: ");
        String course = scanner.nextLine();

        int age = currentYear - year;
        String monthName = getMonthName(month);

        System.out.println("\nStudent Name: " + firstName + " " + lastName);
        System.out.println("Birthdate: " + day + " " + monthName + " " + year);
        System.out.println("Age: " + age);
        System.out.println("Course Registered: " + course);
        scanner.close();
    }
     public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return (month >= 1 && month <= 12) ? months[month - 1] : "Invalid month";
    }
}

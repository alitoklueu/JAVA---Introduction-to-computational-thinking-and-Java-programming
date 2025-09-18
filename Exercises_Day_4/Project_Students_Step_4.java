package Exercises_Day_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_Students_Step_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do you want to register?");
        int register = scanner.nextInt();
        scanner.nextLine(); 
        ArrayList<String> studenList = new ArrayList<>();
        int number = 1;

        do {
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Enter birthday (day of month): ");
            int day = scanner.nextInt();

            System.out.println("Enter birth month: ");
            int month = scanner.nextInt();

            System.out.println("Enter birth year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            System.out.println("Enter course registered: ");
            String course = scanner.nextLine();

            String monthName = getMonthName(month);

            studenList.add(firstName + " " + lastName + ", " + day +" "+ monthName+" " + year + ", " + course);

            number++;

        } while (number <= register);

        System.out.println("List of registered students: ");

        for (int i = 0; i < studenList.size(); i++) {

            System.out.println(studenList.get(i));
        }

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

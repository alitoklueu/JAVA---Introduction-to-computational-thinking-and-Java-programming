import java.util.Scanner;
import java.time.LocalDate;

public class StudentsStep1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read user inputs
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter birthday (day of month): ");
        int birthday = scanner.nextInt();
        
        System.out.print("Enter birth month: ");
        int birthMonth = scanner.nextInt();
        
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline
        
        System.out.print("Enter course registered: ");
        String courseRegistered = scanner.nextLine();

        // Calculate age
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int age = currentYear - birthYear;

        // Display the student's information
        System.out.println("\nStudent Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + birthday + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Course Registered: " + courseRegistered);

        scanner.close();
    }
}
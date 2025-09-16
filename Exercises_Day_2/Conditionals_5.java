package Exercises_Day_2;

import java.util.Scanner;

public class Conditionals_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: >>>");
        int age = input.nextInt();

        System.out.print("Enter your GPA: >>>");
        double gpa = input.nextDouble();

        boolean ageEligible = (age >= 18 && age <= 25);
        boolean gpaEligible = (gpa >= 3.0);

        if (ageEligible && gpaEligible) {
            System.out.println("Congratulations! You're eligible for admission.");
        } else if (ageEligible || gpaEligible) {
            System.out.println("You don't meet all the requirements.");
        } else {
            System.out.println("Sorry, you're not eligible for admission.");
        }

        input.close();
    }
}


// Conditionals University admission

// Instructions You're checking eligibility for admission to a university. If the applicant's age is between 18 and 25, and their GPA (average result of all the grades on a 7 point scale grade) is 3.0 or above, print "Congratulations! You're eligible for admission." If the applicant meets only one of the criteria (age or GPA), print "You don't meet all the requirements." Otherwise, print "Sorry, you're not eligible for admission.”

// Expected output

// example 1 Enter your age: >>>20 Enter your GPA: >>>4.5 Congratulations! You're eligible for admission.

// Expected output

// example 2 Enter your age: >>>26 Enter your GPA: >>>4.5 You don't meet all the requirements
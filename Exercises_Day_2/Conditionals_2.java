package Exercises_Day_2;

import java.util.Scanner;

public class Conditionals_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam score: >>>");
        int score = input.nextInt();

        if (score >= 50) {
            System.out.println("You passed the exam!");
        } else {
            System.out.println("You failed the exam.");
        }
        input.close();
    }
}


// Conditionals Exam result

// Instructions Request the user for their exam result. If their score is 50 or above, print "You passed the exam!”, otherwise print “You failed the exam”.

// Expected output

// example 1 Enter your exam score: >>>65 You passed the exam!

// Expected output

// example 2 Enter your exam score: >>>13 You failed the exam.
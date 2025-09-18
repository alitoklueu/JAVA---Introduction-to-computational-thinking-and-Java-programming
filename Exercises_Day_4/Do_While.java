package Exercises_Day_4;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial loan amount: >>>");
        double loanAmount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the annual interest rate (as a percentage): >>>");
        double interestRate = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the yearly repayment amount: >>>");
        double yearlyRepayment = Double.parseDouble(scanner.nextLine());

        int year = 1;

        do {
            // 1. Add interest (simple interest)
            loanAmount += loanAmount * (interestRate / 100);

            // 2. Annual repayment
            loanAmount -= yearlyRepayment;

            // 3. Reset if there is a negative balance
            if (loanAmount < 0) {
                loanAmount = 0;
            }

            System.out.printf("Remaining balance after year %d: %.1f%n", year, loanAmount);

            if (loanAmount == 0) {
                System.out.println("The loan is fully repaid.");
                break;
            }

            year++;
        } while (loanAmount > 0 && year <= 10);

        if (loanAmount > 0) {
            System.out.println("Loan not fully repaid after 10 years.");
        }

        scanner.close();
    }
}

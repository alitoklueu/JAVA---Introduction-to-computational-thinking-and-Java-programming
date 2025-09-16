package Exercises_Day_2;

import java.util.Scanner;

public class Conditionals_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many tickets do you need: >>>");
        int tickets = input.nextInt();
        input.nextLine(); 

        System.out.print("Do you have student discount (y/n)? >>>");
        String student = input.nextLine();

        int pricePerTicket;
        if (student.equalsIgnoreCase("y")) {
            pricePerTicket = 10;
        } else {
            pricePerTicket = 15;
        }

        int totalPrice = tickets * pricePerTicket;

        System.out.println("Total tickets price: " + totalPrice + " euros");
        input.close();
    }
}


// Conditionals Buying tickets

// Instructions When buying movie tickets, if you're a student, the ticket price is 10€, otherwise the ticket price is 15€. Ask the user how many tickets they need and if they are a student or not, then print the total amount to be paid for the tickets.

// Expected output

// example 1 How many tickets do you need: >>>3 Do you have student discount (y/n)? >>>y Total tickets price: 30 euros

// Expected output

// example 2 How many tickets do you need: >>>4 Do you have student discount (y/n)? >>>n Total tickets price: 60 euros
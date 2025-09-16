package Exercises_Day_1;
import java.util.Scanner;

public class The_input_function_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cost of one night at the hotel: >>>");
        int costPerNight = input.nextInt();

        System.out.print("Enter the number of days of the trip: >>>");
        int numberOfDays = input.nextInt();

        int totalPrice = costPerNight * numberOfDays;

        System.out.println("Price of the trip: " + totalPrice);
        input.close();
    }
}


// The input function Print the total price of the trip

// Instructions A program for a travel agency calculates the cost of staying at a hotel for the entered number of days. It should ask for the cost of one night at the hotel and for the total number of days

// Expected output Enter the cost of one night at the hotel: >>>2800 Enter the number of days of the trip: >>>5 Price of the trip: 14000
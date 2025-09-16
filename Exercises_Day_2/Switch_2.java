package Exercises_Day_2;

import java.util.Scanner;

public class Switch_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a food: ");
        String food = scanner.nextLine().trim();

        switch (food) {
            case "Apple":
            case "Banana":
            case "Cherry":
                System.out.println("Fruit");
                break;

            case "Carrot":
            case "Spinach":
            case "Potato":
                System.out.println("Vegetable");
                break;

            case "Chicken":
            case "Beef":
            case "Pork":
                System.out.println("Meat");
                break;

            default:
                System.out.println("Unknown classification");
        }

        scanner.close();
    }
}


// Switch Food classification

// Instructions Write a program using the switch statement that prints a message for various types of food (e.g., "Fruits", "Vegetables", "Meat"). Group multiple items under a single case label. ● If the user selects "Apple", "Banana" or "Cherry", print “Fruit” ● If the user selects "Carrot", "Spinach" or "Potato", print “Vegetable” ● If the user selects "Chicken", "Beef" or "Pork", print “Meat” ● Others are Unknown classification

// Expected output

// example 1 Enter a food: >>>Beef Meat

// Expected output

// example 2 Enter a food: >>>Ice Cream Unknown classification
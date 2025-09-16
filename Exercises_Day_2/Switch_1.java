package Exercises_Day_2;

import java.util.Scanner;

public class Switch_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select an animal classification (Domestic, Wild or Marine): ");
        String classification = scanner.nextLine().trim();

        switch (classification) {
            case "Domestic":
                System.out.println("Cat, Dog");
                break;
            case "Wild":
                System.out.println("Lion, Tiger");
                break;
            case "Marine":
                System.out.println("Dolphin, Shark");
                break;
            default:
                System.out.println("Unknown classification");
        }

        scanner.close();
    }
}


// Switch Animal classification

// Instructions Write a program that uses a switch statement to print a type of animal based on its classification. ● If the user selects “Domestic”, print “Cat, Dog” ● If the user selects “Wild”, print “Lion, Tiger” ● If the user selects “Marine”, print “Dolphin, Shark” ● Others are Unknown classification

// Expected output

// example 1 Select an animal classification (Domestic, Wild or Marine): >>>Wild Lion, Tiger

// Expected output

// example 2 Select an animal classification (Domestic, Wild or Marine): >>>Birds Unknown classification
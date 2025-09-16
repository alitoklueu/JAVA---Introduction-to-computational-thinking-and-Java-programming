package Exercises_Day_2;

import java.util.Scanner;

public class Project_Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for player names
        System.out.print("What is your name Player 1? ");
        String player1 = scanner.nextLine();

        System.out.print("What is your name Player 2? ");
        String player2 = scanner.nextLine();

        // Assign symbols
        System.out.println("\n" + player1 + " will be X and " + player2 + " will be O\n");

        // Print initial board
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");

        scanner.close();
    }
}

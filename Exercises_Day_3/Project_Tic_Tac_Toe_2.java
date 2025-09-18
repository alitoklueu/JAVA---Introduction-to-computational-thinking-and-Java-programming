package Exercises_Day_3;

import java.util.Scanner;

public class Project_Tic_Tac_Toe_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get player names
        System.out.print("What is your name Player 1? ");
        String player1 = scanner.nextLine();

        System.out.print("What is your name Player 2? ");
        String player2 = scanner.nextLine();

        System.out.println("\n" + player1 + " will be X and " + player2 + " will be O\n");

        // Initialize board
        String[] board = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        printBoard(board);

        // Player 1 makes a move
        System.out.print("\n" + player1 + " choose your move: ");
        int move = scanner.nextInt();

        if (move >= 1 && move <= 9 && board[move - 1].equals(String.valueOf(move))) {
            board[move - 1] = "X";
        } else {
            System.out.println("Invalid move. Try again.");
            // You could loop here to retry, but keeping it simple for now
        }

        System.out.println();
        printBoard(board);
        scanner.close();
    }
     // Helper method to print the board
    public static void printBoard(String[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i]);
            if ((i + 1) % 3 == 0) {
                System.out.println();
            } else {
                System.out.print(" | ");
            }
        }
    }
}

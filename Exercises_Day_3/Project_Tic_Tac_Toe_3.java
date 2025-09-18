package Exercises_Day_3;

import java.util.Scanner;

public class Project_Tic_Tac_Toe_3 {
    public static void main(String[] args) {
        String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Scanner scanner = new Scanner(System.in);
        String currentPlayer = "X";

        System.out.println("Ana will be X and Juan will be O");

        for (int move = 0; move < 9; ) {
            printBoard(board);
            System.out.print((currentPlayer.equals("X") ? "Ana" : "Juan") + ", choose your move: ");
            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 9.");
                continue;
            }

            if (choice < 1 || choice > 9) {
                System.out.println("Invalid move. Choose a number between 1 and 9.");
                continue;
            }

            if (board[choice - 1].equals("X") || board[choice - 1].equals("O")) {
                System.out.println("Invalid move");
                continue;
            }

            board[choice - 1] = currentPlayer;
            currentPlayer = currentPlayer.equals("X") ? "O" : "X";
            move++;
        }

        printBoard(board);
        System.out.println("Game over!");
        scanner.close();
    }

    public static void printBoard(String[] board) {
        System.out.println();
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }
}

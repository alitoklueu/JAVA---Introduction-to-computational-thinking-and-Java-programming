package Exercises_Day_4;

import java.util.Scanner;

public class Project_Tic_Tac_Toe_Step_4 {
    static String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String currentPlayer = "x";
        int moves = 0;

        while (true) {
            printBoard();
            System.out.print((currentPlayer.equals("x") ? "Juan" : "Ana") + " choose your move: ");
            int move = scanner.nextInt() - 1;

            if (board[move].equals("x") || board[move].equals("o")) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            board[move] = currentPlayer;
            moves++;

            String winner = checkWinner();
            
            if (!winner.equals(" ")) {
                printBoard();
                System.out.println((winner.equals("x") ? "Juan" : "Ana") + " won!");
                break;
            } else if (moves == 9) {
                printBoard();
                System.out.println("Tie!");
                break;
            }

            currentPlayer = currentPlayer.equals("x") ? "o" : "x";
        }
    }

    static void printBoard() {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    static String checkWinner() {
        int[][] winConditions = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
        };

        for (int[] condition : winConditions) {
            String a = board[condition[0]];
            String b = board[condition[1]];
            String c = board[condition[2]];
            if (a.equals(b) && b.equals(c)) {
                return a;
            }
        }
        return " ";
    }
}

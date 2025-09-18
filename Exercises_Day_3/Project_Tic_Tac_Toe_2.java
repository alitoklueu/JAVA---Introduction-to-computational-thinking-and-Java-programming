package Exercises_Day_3;

import java.util.Scanner;

public class Project_Tic_Tac_Toe_2 {
   public static void main(String[] args) {

        //Get the player names
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name player 1? ");
        String player1 = scanner.nextLine();
        System.out.print("What is your name player 2? ");
        String player2 = scanner.nextLine();

        System.out.println();
        System.out.println(player1 + " will be X and " + player2 + " will be O");

        //Initialize board variables
        char board1 = '1';
        char board2 = '2';
        char board3 = '3';
        char board4 = '4';
        char board5 = '5';
        char board6 = '6';
        char board7 = '7';
        char board8 = '8';
        char board9 = '9';

        //Print board
        System.out.println();
        System.out.println(" " + board1 + " | " + board2 + " | " + board3 + " ");
        System.out.println(" " + board4 + " | " + board5 + " | " + board6 + " ");
        System.out.println(" " + board7 + " | " + board8 + " | " + board9 + " ");

        System.out.println();
        System.out.print(player1 + " choose your move: ");
        String move = scanner.nextLine();

        switch(move){
            case "1":
                board1 = 'X';
                break;
            case "2":
                board2 = 'X';
                break;
            case "3":
                board3 = 'X';
                break;
            case "4":
                board4 = 'X';
                break;
            case "5":
                board5 = 'X';
                break;
            case "6":
                board6 = 'X';
                break;
            case "7":
                board7 = 'X';
                break;
            case "8":
                board8 = 'X';
                break;   
            case "9":
                board9 = 'X';
                break;
        }

        //Print board
        System.out.println();
        System.out.println(" " + board1 + " | " + board2 + " | " + board3 + " ");
        System.out.println(" " + board4 + " | " + board5 + " | " + board6 + " ");
        System.out.println(" " + board7 + " | " + board8 + " | " + board9 + " ");

        scanner.close();
    }  
    
}

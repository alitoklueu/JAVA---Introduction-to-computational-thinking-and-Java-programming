import java.util.Scanner;

public class TicTacToeStep1 {
    
    public static void main(String[] args) {

        //Get the player names
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name player 1? ");
        String player1 = scanner.nextLine();
        System.out.print("What is your name player 2? ");
        String player2 = scanner.nextLine();

        System.out.println();
        System.out.println(player1 + " will be X and " + player2 + " will be O");
        System.out.println();

        //Print board
        System.out.println(" 1 | 2 | 3 ");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println(" 7 | 8 | 9 ");

        scanner.close();
    }
}

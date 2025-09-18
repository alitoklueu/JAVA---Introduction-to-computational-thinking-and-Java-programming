package Exercises_Day_4;
import java.util.Scanner;

public class For_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        int multiplier = 1;
        do {
            System.out.println("Enter a number between 1 and 10: >>>");
            int number = scanner.nextInt();
            if (number>10) {
                System.out.println("Warning: Enter a number between 1 and 10.");
                break;
            }
            System.out.println(number + " x " + multiplier + " = " + number * multiplier);
            multiplier++;
            
        } while (multiplier<=10);

        scanner.close();
    }
}

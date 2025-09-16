package Exercises_Day_1;
import java.util.Scanner;

public class The_input_function_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Client name: >>>");
        String clientName = input.nextLine();

        System.out.print("Number of package tours bought: >>>");
        int tripsBought = input.nextInt();
        input.nextLine(); 

        System.out.print("Destination offered: >>>");
        String destination = input.nextLine();

        System.out.println("Hello " + clientName + ", You have traveled with us " 
                           + tripsBought + " times already! Do you want to again? "
                           + "Our travel agency is having a sale. Trips to " 
                + destination + " are 50% off!");
                           
        input.close();
    }
}

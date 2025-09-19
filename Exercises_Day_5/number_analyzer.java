package Exercises_Day_5;

import java.util.ArrayList;
import java.util.Scanner;

public class number_analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            System.out.print(">>> ");
            int num = scanner.nextInt();
            if (num == -1) break;
            numbers.add(num);
        }


        int evenCount = 0, oddCount = 0;
        int max = numbers.get(0);
        int min = numbers.get(0);
        int sum = 0;

        for (int n : numbers) {
            if (n % 2 == 0) evenCount++;
            else oddCount++;

            if (n > max) max = n;
            if (n < min) min = n;

            sum += n;
        }

        double average = (double) sum / numbers.size();
        int averageInt = (int) average;

        // Output with printf
        System.out.printf("Total numbers entered: %d\n", numbers.size());
        System.out.printf("Even numbers: %d\n", evenCount);
        System.out.printf("Odd numbers: %d\n", oddCount);
        System.out.printf("Maximum value: %d\n", max);
        System.out.printf("Minimum value: %d\n", min);
        System.out.printf("Average (int): %d\n", averageInt);
        System.out.printf("Average (decimal): %.2f\n", average);
        

        scanner.close();
    }
}

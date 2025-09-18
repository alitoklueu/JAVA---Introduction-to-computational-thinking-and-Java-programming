package Exercises_Day_4;

import java.util.Scanner;

public class For_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        System.out.println("The sentence has " + vowelCount + " vowels.");
    

        scanner.close();
    }
}

package Exercises_Day_3;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: >>> ");
        int number = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter a sentence: >>> ");
        String sentence = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (number % 2 == 0) {
                    // Convert to lowercase manually
                    if (ch >= 'A' && ch <= 'Z') {
                        result.append((char)(ch + 32));
                    } else {
                        result.append(ch);
                    }
                } else {
                    // Convert to uppercase manually
                    if (ch >= 'a' && ch <= 'z') {
                        result.append((char)(ch - 32));
                    } else {
                        result.append(ch);
                    }
                }
            } else {
                result.append(ch); // keep non-letter characters
            }
        }

        System.out.println(result.toString());
        scanner.close();
    }
}

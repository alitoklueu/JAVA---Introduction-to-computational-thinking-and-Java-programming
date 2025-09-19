package Exercises_Day_5;

public class ternary_3 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        int largest;

        largest = a;
        largest = (b > largest) ? b : largest;
        largest = (c > largest) ? c : largest;

        System.out.println("The largest number is " + largest);

    }
}

package Exercises_Day_3;

public class Casting_3 {
    public static void main(String[] args) {
        long longVal = 100000L;
        float floatVal = longVal;
        System.out.println("The short value is (implicit): " + floatVal);
        floatVal =(float) longVal;
        System.out.println("The short value is (explicit): " + floatVal);
    }
}

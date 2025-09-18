package Exercises_Day_3;

public class Casting_1 {
    public static void main(String[] args) {
        byte byteVal = 100;
        short shortVal = byteVal;
        System.out.println("The short value is (implicit): " + shortVal);
        shortVal =(short) byteVal;
        System.out.println("The short value is (explicit): " + shortVal);
    }
}

package Exercises_Day_3;

public class Casting_2 {
    public static void main(String[] args) {
        long longVal = 100000L;
        // int intVal = longVal;
        // System.out.println("The short value is (implicit): " + intVal);
        int intVal =(int) longVal;
        System.out.println("The short value is (explicit): " + intVal);
    }
}

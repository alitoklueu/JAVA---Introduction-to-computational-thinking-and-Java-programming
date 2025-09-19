package Exercises_Day_5;

import java.text.NumberFormat;
import java.util.Locale;

public class printf_1 {
    public static void main(String[] args) {
        int quarter = 1; 
        int year = 2023; 
        double revenue = 1234567.89; 
        double percentageChange = -2.5;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedRevenue = currencyFormatter.format(revenue);
        System.out.println("Q"+quarter+ " "+ year+" Revenue: "+formattedRevenue+" Change: "+ percentageChange + "%");
    }
}

package Exercises_Day_1;
public class Variables_and_operations_2 {
    public static void main(String[] args) {
        int laptopPrice = 55480;   
        int monitorPrice = 21830; 
        int mousePrice = 411;   
        int keyboardPrice = 290;   

        
        int total = (6 * laptopPrice) + (3 * monitorPrice) + (11 * mousePrice) + (5 * keyboardPrice);

        System.out.println("Need to allocate: " + total);
    }
}

// 2.2 - Variables and operations Print the total amount allocated

// Instructions There is a request for the purchase of computers and components for them: - 6 laptops for 55480 dollars each; - 3 monitors for 21830 dollars each; - 11 computer mice for 411 dollars each; - 5 keyboards for 290 dollars each. Calculate how much to allocate from the company's budget. Use 4 variables to store the prices of each of the components.

// Expected output Need to allocate: 404341
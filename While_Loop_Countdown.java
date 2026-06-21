import java.util.Scanner; // Import Scanner for user input

public class While_Loop_Countdown {
    public static void main(String[] args) {
        /*
         * Problem: Create a countdown timer from N down to 1 based on user input.
         * Solution: Used a 'while' loop with a decrement operator (i--), 
         * taking input N from the user to set the starting point.
         */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting point for the countdown: ");
        int i = sc.nextInt(); // Taking input from user
        
        System.out.println("Starting countdown from " + i + ":");
        
        while (i >= 1) {
            System.out.println("Value: " + i);
            i--; // Decrease value in each iteration
        }
        
        System.out.println("Countdown complete.");
        
        // Closing scanner to prevent memory leak
        sc.close(); 
    }
}
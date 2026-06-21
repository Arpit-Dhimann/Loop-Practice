import java.util.Scanner;

public class While_Loop_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (N) to calculate sum: ");
        int n = sc.nextInt();
        
        int i = 1;
        int sum = 0;
        
        // Loop runs until i reaches N
        while (i <= n) {

            sum += i; // Add current value of i to sum
            i++;      // Move to next number
            
        }
        
        System.out.println("The total sum from 1 to " + n + " is: " + sum);
        
        sc.close(); // Closing scanner to prevent memory leak
    }
}
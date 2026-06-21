// Problem: Check whether numbers from 1 to N are Even or Odd.
// Solution: Used a 'for' loop to iterate and the modulo operator (%) to check divisibility.

import java.util.Scanner;

public class For_Loop_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the limit to check numbers: ");
        int limit = sc.nextInt();
        
        System.out.println("Checking numbers from 1 to " + limit + ":");
        
        // Loop runs from 1 up to the user-defined limit
        for (int i = 1; i <= limit; i++) {

            // Check if the number is divisible by 2
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }

        }
        
        sc.close();
    }
}
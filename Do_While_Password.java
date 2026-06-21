// Problem: Secure access by forcing password entry until correct input is provided.
// Solution: 'do-while' loop forces the execution of the prompt at least once and re-prompts on failure

import java.util.Scanner;

public class Do_While_Password {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter the secure password: ");
            password = sc.next();
            
            if (!password.equals("AD555")) {

                System.out.println("Incorrect password! Try again.");

            }
        } while (!password.equals("AD555")); // Condition: Loop until password is correct

        System.out.println("Access Granted. Welcome, Developer!");
        sc.close();
    }
}    
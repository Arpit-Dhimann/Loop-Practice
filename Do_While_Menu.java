import java.util.Scanner;

public class Do_While_Menu {
    public static void main(String[] args) {
        // Problem: Create an interactive menu that stays active until the user chooses to exit.
        // Solution: Using 'do-while' loop ensures the menu is displayed at least once, and the condition is checked after the user provides input.

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Display Welcome Message");
            System.out.println("2. Exit System");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Welcome to the Java Learning Portal!");
            }
        } while (choice != 2); // Condition: Keep running if choice is not 2

        System.out.println("System exited successfully.");
        sc.close();
    }
}
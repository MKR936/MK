
// Importing necessary packages (not required in this simple example)
import java.util.Scanner;

public class Sum {

    // Main method - the entry point of the program
    public static void main(String[] args) {

        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display the sum to the user
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Check if the sum is even or odd
        if (sum % 2 == 0) {
            System.out.println("The sum is an even number.");
        } else {
            System.out.println("The sum is an odd number.");
        }

        // Example of a loop: print numbers from 1 to 5
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}

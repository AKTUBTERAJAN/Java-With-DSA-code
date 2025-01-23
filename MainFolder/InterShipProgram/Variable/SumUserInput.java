import java.util.*;

public class SumUserInput {

    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){

            // Take user
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt(); // Read the first number

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt(); // Read the second number

            // Calculate the sum of the two numbers
            int sum = num1 + num2;

            // Print the sum
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            // Close the scanner to avoid resource leak
            sc.close();
        }    
    }
}

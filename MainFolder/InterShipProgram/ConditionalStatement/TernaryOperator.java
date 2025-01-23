
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            float number = sc.nextFloat();
            // Using Ternary Operator;
            String type=(number%2.0==0)?number + " is a Even Number":number + " is a Odd Number";
            System.out.println(type);
    
        }
    }

}

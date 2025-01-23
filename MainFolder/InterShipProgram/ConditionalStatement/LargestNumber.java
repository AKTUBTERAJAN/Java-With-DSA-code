
import java.util.Scanner;

// Find The The Largest Number Of Any Two Number 
public class LargestNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The First Number: ");
            float A = sc.nextFloat();
            System.out.print("Enter the second number: ");
            float B = sc.nextFloat();
            if(A>B){
                System.out.println("A is The Lagest Number");
            }
            if(A==B){
                System.err.println("A and B is Also Equal");
            }
            else{
                System.out.println("B is the Lagest Number");
            }
        }
    }
    
}

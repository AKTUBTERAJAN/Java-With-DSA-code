
import java.util.Scanner;

public class WhileReverseNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.err.print("Enter a Number: ");
            int n=sc.nextInt();
            while (n>0) { 
               int lastdigit = n%10;
               System.err.print(lastdigit);
               n=n/10;
                
            }
        }
    }
}

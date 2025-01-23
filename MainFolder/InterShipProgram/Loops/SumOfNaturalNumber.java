
import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter The Given Number: ");
            int n = sc.nextInt();
            int sum=0;
            int i =1;
            while (i<=n) {
                sum+=i; // OR sum=sum+i;
                i++;
                
            }
            System.out.println("Digit Sum Of Given Number: " + sum);
        }
        
    }
    
}

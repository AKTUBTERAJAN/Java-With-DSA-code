
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number is: ");
            int number=sc.nextInt();
            int fact=1;
            for(int i=number; i>=1; i--){
                fact=fact*i;
            }
            System.out.println("The Factorial of "+number  + " is: "+fact);


        }
    }
    
}

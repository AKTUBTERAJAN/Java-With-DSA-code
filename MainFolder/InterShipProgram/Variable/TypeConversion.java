
import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        
        // Convert the  is possiable Number
        /* 
        int a = 10;
        float b =a;
        System.out.println("The Number is Coverted Sucessful: "+b);
        */

        // Covert The Number Is  Possible
       /*  float a = 50.5f;
        double b = a;
        System.out.println("The Number is Coverted Sucessful: "+b);
        */
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            float a = sc.nextInt();
            System.out.println("The Number is Coverted Sucessful: "+a);

        }
        
    }
    
}

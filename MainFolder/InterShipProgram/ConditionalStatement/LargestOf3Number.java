
import java.util.Scanner;

public class LargestOf3Number {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter The First Number: ");
            float a = sc.nextFloat();
            System.out.print("Enter The Second Number: ");
            float b = sc.nextFloat();
            System.out.print("Enter The Third Number: ");
            float c = sc.nextFloat();
            if(a>b && a>=c){
                System.out.println(a + " is The Largest Number");
            }
            else if(b>=c){
                System.out.println(b + " is The Largest Number");

            }
            else{
                System.out.println(c + " is The Largest Number");
                
            }
            
        }
    }
}

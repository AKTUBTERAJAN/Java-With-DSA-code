
import java.util.Scanner;

public class SideSqure2 {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter The Side: ");
            float Side =sc.nextFloat();
            float area = Side*Side;
            System.out.println("The Side Area is:"+area);
        }
    }
    
}

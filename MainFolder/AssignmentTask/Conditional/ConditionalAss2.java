
import java.util.Scanner;

public class ConditionalAss2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Temperature: ");
            float tem = sc.nextFloat();
            String Status = (tem>100)?"You have a Fever ":"You do not have a fever";
            System.out.println(Status);
        }
    }
    
}

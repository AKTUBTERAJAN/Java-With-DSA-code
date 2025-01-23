
import java.util.Scanner;

public class ConditionalAss1 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Whether : ");
            float whether = sc.nextFloat();
            String Status=(whether>=0)?"Whether is Positive":"Whether is Nagative";
            System.out.println(Status);
        }
    }
}


import java.util.Scanner;

public class SimpleInterest {

    private static float SI;
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Principle: ");
            float P = sc.nextFloat();
            System.out.print("Enter the interest: ");

            float R = sc.nextFloat();
            System.out.print("Enter the time: ");
            float T = sc.nextFloat();
            SI=(P*R*T)/100;
            System.out.println("Simple Interest Is: " +SI +"Rupees");
        }
    }
}

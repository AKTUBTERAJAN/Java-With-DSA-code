
import java.util.Scanner; // package import

public class Sum2Number {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
        System.out.print("Enter The First Number:");
        float a = sc.nextFloat();
        System.out.print("Enter The Second Number:");
        float b =sc.nextFloat();
        float sum = a+b;
        System.out.println("The Sum Of Two Number is :"+sum);
        sc.close();

        }
    }
}

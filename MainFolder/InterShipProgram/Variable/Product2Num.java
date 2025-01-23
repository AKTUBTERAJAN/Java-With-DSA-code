
import java.util.Scanner;

public class Product2Num {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The First Number:");
            float a = sc.nextFloat();
            System.out.print("Enter The First Number:");
            float b = sc.nextFloat();
            float Product= a*b;
            System.out.println("Product of Two Number is :"+Product);
        }
    }
}

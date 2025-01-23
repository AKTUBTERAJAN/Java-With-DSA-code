
import java.util.Scanner;

public class SumNumberFunction {
    public static void claculate(){
        try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the First Number: ");
        float a =sc.nextFloat();
        System.out.print("Enter the Second Number: ");
        float b=sc.nextFloat();
        float sum= a+b;
        System.out.println("Sum of two Number is: " +sum);                       }
    }
    public static void main(String[] args) {
        claculate();
        
    }
}

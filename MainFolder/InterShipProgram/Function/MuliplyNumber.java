
import java.util.Scanner;

public class MuliplyNumber {
    public static int   ProductNumner(int num1, int num2){
            int c=num1*num2;
            System.out.println("The Product of Two Number is: "+c);
            return c;

    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter The First Number is: ");
            int num1=sc.nextInt();
            System.out.print("Enter The Second  Number is: ");

            int num2=sc.nextInt();
            ProductNumner(num1, num2);
        }
        
    }
}

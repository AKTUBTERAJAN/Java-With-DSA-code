
import java.util.Scanner;

public class Factorial {
    public static int  Factorial1(int num ){
        int f=1;
        for (int i=1; i<=num;i++) {
            f=f*i;
        }
        System.out.println("The Factorial of "+num+" is: "+f);
        return f;


    }
    public static void main(String[] args) {
        try(Scanner sc=new  Scanner(System.in)){
            System.out.print("Enter The Number To Find Fcatorial: ");
            int num=sc.nextInt();
            Factorial1(num);
        }
    }
}

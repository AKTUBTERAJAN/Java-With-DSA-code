import java.util.Scanner;

public class Function3 {
    public static void calculate(float n1,float n2){// parameter or formal parameter
        float sum= n1+n2;
        System.out.println("Sum of two Number is: " +sum);   
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the First Number: ");
            float a =sc.nextFloat();
            System.out.print("Enter the Second Number: ");
            float b=sc.nextFloat();
            calculate(a,b);// arguments or actual parameters
        }
    }
    
}


import java.util.Scanner;

public class CallByValue {
    public static  void  CallByValue1(int num1,int num2){
         //swap
         int temp =num1;
         num1=num2;
         num2=temp;
         System.out.println("Number1 is = "+num1);
         System.out.println("Number2 is = "+num2);

    }
    public static void main(String[] args) {
        // swap value exchange 
        try(Scanner sc= new Scanner(System.in)){        
                //int a=5;
                //int b=10;
            System.out.print("Enter the First Number: ");
            int num1=sc.nextInt();
            System.out.print("Enter The Second Number: ");
            int num2=sc.nextInt();
            CallByValue1(num1, num2);

       
        }
    }
}

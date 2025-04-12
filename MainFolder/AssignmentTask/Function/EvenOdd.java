
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            if(isEven(n)){
                System.out.print(n+" is a even Number");
            }
            else{
                System.out.print(n+" is a Odd  Number ");
            }
        }
    }
    public static  boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;

        }
    }
}


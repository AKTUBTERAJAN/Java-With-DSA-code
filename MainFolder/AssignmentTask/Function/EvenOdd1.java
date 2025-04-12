
import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {
        try(Scanner sc=new  Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int n=sc.nextInt();
            if(n%2==0){
                System.out.print(n+" is a Even Number Number");
            }
            else{
                System.out.print(n+" is a odd Number");
            }
        }
    }
}

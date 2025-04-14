
import java.util.Scanner;

public class ButterflyPattern {
    public  static  void  ButterflyPattern1(int n){
        //1st Half 
        //Outer Loop
        for(int i=1; i<=n;i++){
            //inner loop
            //print star
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            //Print Space
            for(int j=1; j<=2*(n-i);j++){
                System.out.print("   ");
            }
            //Print Star
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
        System.out.println();

        }
        //2ND Half
        //Outer loop
        for(int i=n; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            //Print Space
            for(int j=1; j<=2*(n-i);j++){
                System.out.print("   ");
            }
            //Print Star
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
        System.out.println();

        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            ButterflyPattern1(n);
        }
        
    }
}

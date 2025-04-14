
import java.util.Scanner;

public class O1Trangle {
    public static void Trangle(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            Trangle(n);
        }
        
    }
}


import java.util.Scanner;

public class InvertedNumber {
    public static void HalfNumberPramid(int n){
        //outer loop
        for(int i=1; i<=n;i++){
            //inner loops
            for(int j=1; j<=n-i+1; j++){
                System.out.print(" "+j+" ");
            }
        System.out.println();

        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Number : ");
            int n=sc.nextInt();
            HalfNumberPramid(n);
        }
        
    }
}

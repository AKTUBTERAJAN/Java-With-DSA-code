
import java.util.Scanner;

public class HOllowSquarePattern {
    public static void HollowPattern(int n) {
        for(int i=1;i<=n; i++){
            for(int j=1;j<=n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number is: ");
            int n=sc.nextInt();
            HollowPattern(n);
        }
    }
}


import java.util.Scanner;

public class HalfStarPyramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Total Number: ");
            int n=sc.nextInt();
            Pramid(n);
        }
    }
    public static void  Pramid(int n){
        //OUTER
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

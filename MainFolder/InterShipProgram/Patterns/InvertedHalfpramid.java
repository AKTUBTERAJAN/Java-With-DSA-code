
import java.util.Scanner;

public class InvertedHalfpramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            for(int line=1; line<=n; line++){
                for(int Number=1; Number<=(n-line+1);Number++){
                    System.out.print(" "+Number+" ");
                }
                System.out.println();
            }
        }
    }
    
}

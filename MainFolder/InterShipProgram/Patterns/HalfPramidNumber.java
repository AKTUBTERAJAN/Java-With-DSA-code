
import java.util.Scanner;

public class HalfPramidNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int n=sc.nextInt();
            for(int line=1; line<=n; line++){
                for(int Number=1;Number<=line; Number++){
                    System.out.print(" "+Number+" ");
                }
                System.err.println();
            }
        }
    }
    
}

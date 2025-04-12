
import java.util.Scanner;

public class Flyods2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            for(int line=1; line<=n; line++){
                for(int x=n; x>line; x--){
                    System.out.print("   ");
                }
                for(int j=1;j<=line; j++ ){
                    System.out.print(" "+j+" ");
                }
                System.out.println( );
            }
        }
    }
}

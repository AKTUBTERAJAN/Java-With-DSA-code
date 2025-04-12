
import java.util.Scanner;

public class Flyods4 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int n=sc.nextInt();
            for(int line=1;line<=n; line++){
                for(int x=1; x<line; x++){
                    System.out.print("   ");
                }
                for(int number=line; number<=n; number++){
                    System.out.print(" "+number+" ");
                }
                System.out.println();
            }
        }
    }
}

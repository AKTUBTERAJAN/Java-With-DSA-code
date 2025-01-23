
import java.util.Scanner;

public class PrintInvertedStar{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int n=sc.nextInt();
            for(int line=1; line<=n; line++){
                for(int star =1;star<=(n-line+1);star++){
                    System.out.print(" * ");

                }
                System.out.println();
            }
        }
    }
}
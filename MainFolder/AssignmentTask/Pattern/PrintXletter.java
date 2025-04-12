
import java.util.Scanner;

public class PrintXletter {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            for(int row=1; row<=n; row++){
                for(int col=1;col<=n;col++){
                    if(row-col==0|| row+col == n+1){
                        System.out.print(" * ");
                    }
                    else System.out.print("   ");
                }
                System.out.println();
            }
        }
    }
}

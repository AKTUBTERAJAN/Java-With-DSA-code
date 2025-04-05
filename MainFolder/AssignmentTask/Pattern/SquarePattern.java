import java.util.Scanner;

public class SquarePattern{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            for(int row=1; row<=n; row++){
                for(int col=1; col<=n; col++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            System.out.println("This is the Square Pattern");
        }

    }
}
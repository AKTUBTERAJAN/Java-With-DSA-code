import java.util.Scanner;

public class TranglePattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            for(int row=1; row<=n; row++){
                for(int col=1; col<=row; col++){
                    System.out.print(" * ");
                }
                System.out.println();
        }
        System.out.println("This is the Bottom Left trangle");
        
            
        }
        
        
    }
}

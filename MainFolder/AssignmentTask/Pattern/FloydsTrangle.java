import java.util.Scanner;

public class FloydsTrangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            int val=1;
            for(int row=1; row<=n; row++){
                for(int col=1; col<=row; col++){
                    System.out.print(val+" ");
                    val++;
                    
                }
                System.out.println();
        }
        System.out.println("This is the bottom Flyods  trangle");
        
            
        }
        
        
    }
}

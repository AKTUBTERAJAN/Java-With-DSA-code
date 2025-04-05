import java.util.Scanner;

public class RectengalPattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Number of Rows: ");
            int r=sc.nextInt();
            System.out.print("Enter The Number of Coloum: ");
            int c= sc.nextInt();
            for(int row=1; row<=r; row++){
                for(int col=1; col<=c; col++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            System.out.println("This is the Rectengal Pattern");
        }
    }
    
}

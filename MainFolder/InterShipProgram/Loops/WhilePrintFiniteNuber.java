
import java.util.Scanner;

public class WhilePrintFiniteNuber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Number Range: ");
            int range =sc.nextInt();
            int counter = 1;
            while (counter<=range) {
                System.out.print(counter+" "); 
                counter++;
                
            }
            System.out.println();
            System.out.println("Print of Range Number");
        }
    }
}

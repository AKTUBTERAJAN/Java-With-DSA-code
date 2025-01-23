
import java.util.Scanner;

public class ContinueStatement {
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {
        try(Scanner sc = new  Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int number=sc.nextInt();
        for(int i =1; i<=number; i++){
            if (i==3) {
                System.out.println("To Skip the bari");
                continue;
            }
            if (i==5) {
                System.out.println("To Skip the bari");
                continue;
            }
            if (i==8) {
                System.out.println("To Skip the bari");
                continue;
            }
            if (i==15) {
                System.out.println("To Skip the bari");
                continue;
            }
            if (i==20) {
                System.out.println("To Skip the bari");
                continue;
            }
            System.out.println(i);
        }

        }
    }
}

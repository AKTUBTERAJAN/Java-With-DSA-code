
import java.util.Scanner;

public class StudentFailPass {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number of Subject: ");
            float mark = sc.nextFloat();
            java.lang.String status = (mark>33)?"Student is Pass":"Student is Fail";
            System.out.println(status);
        }
    }
    
}

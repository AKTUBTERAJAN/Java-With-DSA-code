
import java.util.Scanner;

public class AreaOfCircel {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter The Circle Of Redius:");
            float red = sc.nextFloat();
            float Area = 3.14f * red * red;
            System.out.println("The Area of Circel is:"+Area);
        }
    }
}


import java.util.Scanner;

public class SumOfNth {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int number=sc.nextInt();
            int sum=0;
            int counter = 1;
            while (counter<=number) { 
                sum+=counter;
                counter++;
            }
            System.out.println("Digit Sum Of Given Number: " + sum);
        }
    }
}

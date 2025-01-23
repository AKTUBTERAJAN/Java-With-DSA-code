
import java.util.Scanner;

public class WhilePrintTable {
    public static void main(String[] args) {
        try(Scanner sc = new  Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int Number=sc.nextInt();
            int counter=1;
            while (counter<=10) {
                System.out.println(counter*Number);
                counter++; 

            }
            System.out.println("The Table of Given Number");
        }
        }
}

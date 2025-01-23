
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try(Scanner sc = new  Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            int counter=1;
            while (counter<=10) { 
                System.out.println(counter*n);
                counter++;
            }
              System.out.println("The Multiplication table is printed Sucsessfull");  
            }
        }
    }


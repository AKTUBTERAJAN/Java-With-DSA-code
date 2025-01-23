
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try(Scanner sc = new  Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int n=sc.nextInt();
            if(n/2==0){
                System.out.println(n+" is not a Prime Numnber");
            }
            else{
                System.out.println(n+" is a Prime Number");
            }
        }
    }
}

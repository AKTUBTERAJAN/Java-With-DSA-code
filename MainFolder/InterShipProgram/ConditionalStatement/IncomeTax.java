
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Amount To Calculate the Tax: ");
            float income = sc.nextFloat();
            float tax;
            if(income<500000){
                tax =0;
            }
            else if(income>=500000 && income <=1000000){
                tax = (income*0.2f);
            }
            else {
                tax = (income*0.3f);
            }
            System.out.println("Your tax is: " + tax + " Rupees");
        }
    }
    
}

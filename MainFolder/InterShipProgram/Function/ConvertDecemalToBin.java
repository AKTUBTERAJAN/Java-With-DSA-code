
import java.util.Scanner;

public class ConvertDecemalToBin {
    public  static void decimaltobinary(int decimal){
        int mynumber=decimal;
        int pow=0;
        int binarynumber=0;

        while (decimal>0) { 
            int remainder=decimal%2;
            binarynumber=binarynumber+(remainder*(int)Math.pow(10, pow));

            pow++;
            decimal=decimal/2;
        }
        System.out.println("Binary of "+mynumber+" is= "+binarynumber);

        
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter The Number to Find Binary: ");
            int decimal=sc.nextInt();
            decimaltobinary(decimal);
        }
    }
}

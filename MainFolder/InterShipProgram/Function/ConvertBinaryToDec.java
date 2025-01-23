
import java.util.Scanner;

public class ConvertBinaryToDec {
    public static void Binarytodecimal(int binarynumber) {
        int mynumber=binarynumber;
        int pow=0;  //pow(power Variable)
        int decnumber=0;//decnumber(Decemal Number Variable)
        
        while (binarynumber>0) { 
            int lastdigit=binarynumber%10;
            decnumber=decnumber+(lastdigit*(int)(Math.pow(2, pow)));

            pow++;
            binarynumber=binarynumber/10;
        }
        System.out.println("Decimal of "+mynumber+" is= "+decnumber);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter The Binary Number is: ");
            int binarynumber=sc.nextInt();
            Binarytodecimal(binarynumber);
        }
    }
}

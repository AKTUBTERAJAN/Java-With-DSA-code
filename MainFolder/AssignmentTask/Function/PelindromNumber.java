
import java.util.Scanner;

public class PelindromNumber {
    public static void main(String[] args) {
         try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Number is: ");
            int number=sc.nextInt();
            if(isPelindrom(number)){
                System.out.println(number+" is a Pelindrom Number");
            }
            else{
                System.out.println(number+" is not a Pelindrom Number");
            }

         }
        
    }
    public static boolean  isPelindrom(int number) {
        int numbercopy=number;//copy number into a variable
        int reverse=0;
        while (numbercopy>0) { 
            int reminder=number%10;
            reverse =reverse*10+reminder;// adding the digit which is 0 then add rem.
            numbercopy=numbercopy/10;// Remove the Last Digit
            
        }
        //if orignal and reverse number is equal means 
        //number is Pelendrom in java
        if(number==reverse){
            return true;
        }
        return false;
        
    }
}

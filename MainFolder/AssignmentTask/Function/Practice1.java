
import java.util.Scanner;

public class Practice1 {
    public static double Average(double first,double Second,double third){
        return (first+Second+third)/3;
    }
    
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the First Number: ");
            double first=sc.nextDouble();
            System.out.print("Enter the Second Number: ");
            double Second=sc.nextDouble();
            System.out.print("Enter the Third Number: ");
            double third=sc.nextDouble();
            System.out.print("The Avarage of 3 Number is: "+Average(first, Second, third));

        }
    }   
}

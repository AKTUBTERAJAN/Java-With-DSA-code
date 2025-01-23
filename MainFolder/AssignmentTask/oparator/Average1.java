
import java.util.Scanner;

public  class  Average1{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.err.print("Enter The First Number: ");
            float A = sc.nextFloat();
            System.err.print("Enter The Second Number: ");
            float B = sc.nextFloat();
            System.err.print("Enter The Third Number: ");
            float C = sc.nextFloat();
            float D= (A+B+C)/3;
            System.out.println("The Result of Avarage is:"+D);
            
        }
        
    }
}
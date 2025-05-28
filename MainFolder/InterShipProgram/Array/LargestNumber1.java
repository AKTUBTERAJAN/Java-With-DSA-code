
import java.util.Scanner;

public class LargestNumber1{
    public static int LargestNumber(int number[]) {
        int largest=Integer.MIN_VALUE;//

        for(int i=0; i<number.length;i++){
            if (largest<number[i]) {
                largest=number[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the How Many Number To enter: ");
            int size=sc.nextInt();
            int number[]=new int[size];
            System.out.println("Enter"+size+"Number Use To SPace");
            for(int i=0; i<size; i++){
                number[i]=sc.nextInt();
            }
        System.out.println("Largest Value is: "+LargestNumber(number));

        }
    }
}


import java.util.Scanner;

public class SmallLestNumber {
    public static int SmallLestNumber1(int number[]){
        int smallLest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallLest>number[i]){
                smallLest=number[i];
            }
        }
        return smallLest;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the How Many Number are Enter: ");
            int size=sc.nextInt();

            int number[]=new int[size];
            System.out.println("Enter"+size+"Number");
            for(int i=0; i<size; i++){
                number[i]=sc.nextInt();
            }
            System.out.println("Smallest Number is: "+SmallLestNumber1(number));

        }
    }
}

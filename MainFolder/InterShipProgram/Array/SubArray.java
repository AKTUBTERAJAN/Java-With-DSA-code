
import java.util.Scanner;

public class SubArray {
    public static void Sub1(int number[]) {
        int ts=0;
        // Start 
        for(int i=0; i<number.length;i++){
            for(int j=i; j<number.length;j++){
                for(int k=i;k<=j; k++){
                    System.out.print(number[k]+" ");
                }
                ts++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.print("total Sub Array is: "+ts);
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter The Number of element: ");
            int size= sc.nextInt();

            int number[]=new int [size];
            System.out.println("Enter the "+size+" Number");
            for(int i=0; i<number.length; i++){
                number[i]=sc.nextInt();
            }
            Sub1(number);

        }
    }
}


import java.util.Scanner;

public class TakeInpute {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the Size of Array : ");
            int Size=sc.nextInt();

            int number[] = new int[Size];
            System.out.println("Enter the "+Size+" Number");
            for(int i=0; i<number.length; i++){
                number[i]=sc.nextInt();
            }
            System.err.println("Array Display is :");
            for(int i=0;i<number.length;i++ ){
                System.out.print(number[i]+" ");
            }
        }
    }
    
}

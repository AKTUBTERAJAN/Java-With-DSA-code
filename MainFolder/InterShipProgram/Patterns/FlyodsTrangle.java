
import java.util.Scanner;

public class FlyodsTrangle {
    public  static void  Flyod1(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int n=sc.nextInt();
            Flyod1(n);
        }
        
        
    }
    
}

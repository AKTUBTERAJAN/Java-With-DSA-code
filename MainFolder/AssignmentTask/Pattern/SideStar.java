
import java.util.Scanner;

public class SideStar {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n= sc.nextInt();
            for(int line =1; line<=n; line++){
                for(int number=1;number<=n; number++){
                    if(line==1 || line==n || number==1 || number==n){
                    System.out.print(" * ");

                    }
                    else{
                        System.out.print("   ");
                    }
                }
                System.out.println();

            }
        }
    }
}

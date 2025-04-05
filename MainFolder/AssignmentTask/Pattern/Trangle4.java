import java.util.Scanner;

public class Trangle4 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            for(int row=1; row<=n;row++){
                for(int col=1; col<=n;col++){
                    if(row+col>=n+1){
                        System.out.print(" * ");
                    }
                    else System.out.print("   ");
                }
                System.out.println();

            }
            System.out.print("This is the Bottom Right Trangle");
        }
    }
    
}

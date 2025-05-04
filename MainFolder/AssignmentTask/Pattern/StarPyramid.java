import java.util.Scanner;

public class StarPyramid {
    public static void Pyramid1(int n){
        for(int i=1;i<=n;i++){
            // Print Space
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            //print number
            for(int j=1; j<=i; j++){
                System.out.print(" * ");

            }
            for(int j=i-1;j>=1; j--){
                System.out.print(" * ");

            }
        System.out.println();

        }

    }
     public static void main(String[] args) {
        try(Scanner sc=new  Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            Pyramid1(n);
        }
    }
    
}

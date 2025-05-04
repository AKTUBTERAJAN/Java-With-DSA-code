
import java.util.Scanner;

public class DimondPyramid {
    public static void DimondPyramid1(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            for(int j=i-1;j>=1;j--){
                if(i==1||j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            for(int j=i-1;j>=1;j--){
                if(i==1||j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number is: ");
            int n=sc.nextInt();
            DimondPyramid1(n);
        }
    }
}

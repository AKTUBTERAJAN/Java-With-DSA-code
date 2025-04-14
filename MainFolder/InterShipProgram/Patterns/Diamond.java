import java.util.Scanner;

public class Diamond {
    public static void Diamond1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println(); 
        }
        System.out.println("This  is The Daimond Pattern");
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n=sc.nextInt();
            Diamond1(n);

        }
    }
}

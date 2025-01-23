import java.util.Scanner;

public class PrintCharacter {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Line Number: ");
            int n=sc.nextInt();
            char ch='A';
            for(char line=1; line<=n; line++){
                for(char chars=1; chars<=line; chars++ ){
                    System.out.print(" "+ch+" ");
                    
                    System.out.print(" "+chars+" ");
                    ch++;
                    
                }
                System.out.println();
            }
        }
    }
}

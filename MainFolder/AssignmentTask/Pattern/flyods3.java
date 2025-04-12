import java.util.Scanner;

public class flyods3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            for(int line=n; line>=1; line--){
                for(int x=1; x<=line; x++){
                    System.out.print("   ");
                }
                for(int j=n;j>=line; j-- ){
                    System.out.print(" "+j+" ");
                }
                System.out.println();
            }
        }
    }
    
}

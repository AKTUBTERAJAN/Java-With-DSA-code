import java.util.Scanner;

public class flyod5 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int n=sc.nextInt();
            for(int line=n;line>=1; line--){
                for(int x=n; x>line; x--){
                    System.out.print("   ");
                }
                for(int number=line; number>=1; number--){
                    System.out.print(" "+number+" ");
                }
                System.out.println();
            }
        }
    }
}

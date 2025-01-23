import java.util.Scanner;

public class PrintInvertedCharacter {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Line Number: ");
            int n=sc.nextInt();
            char ch ='A';
            for(int line=1; line<=n; line++){
                for(int chars=1;chars<=(n-line+1);chars++){
                    System.out.print(" "+ch+" ");
                    ch++;
                }
                System.out.println();
            }
        }
    }    
}

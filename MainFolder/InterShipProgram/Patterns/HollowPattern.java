import java.util.Scanner;

public class HollowPattern {
    public static void hello_rectengle(int totRow, int tolCol){
        // outer loop
        for(int i=1; i<=totRow; i++){
            //inner-column
            for(int j=1; j<=tolCol; j++){
                //cell-(i,j)
                if(i==1|| i==totRow|| j==1|| j==tolCol){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
        System.out.println("This is the Hollow Rectengle");
            
    }
        
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Total Row: ");
            int totRow=sc.nextInt();
            System.out.print("Enter The Total Column: ");
            int tolCol=sc.nextInt();
            hello_rectengle(totRow, tolCol);

        }
        
    }
}

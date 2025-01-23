import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            do{
                System.out.print("Enter the Number: ");
                int n= sc.nextInt();

                if(n%10==0){
                    continue;
                }
                System.out.println("Number Was: "+n);
            }while(true);
        }
    }
    
}

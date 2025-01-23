import java.util.Scanner;

public class PrimeNumber {
    public static boolean number(int num){
        boolean isPrime =true;
        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
            
        }
        return isPrime;
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int num= sc.nextInt();
            System.out.println(number(num));
        }
    }
    
}

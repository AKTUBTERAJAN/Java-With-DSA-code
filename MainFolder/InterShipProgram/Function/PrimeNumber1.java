import java.util.Scanner;

public class PrimeNumber1 {
    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }

        for (int i =2;i<=Math.sqrt(num);i++){
            if(num%i==0){
               return false; 
            }
        }
          return true;    
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the Number is: ");
            int num=sc.nextInt();
        System.out.println(isPrime(num));
        }
    }
}

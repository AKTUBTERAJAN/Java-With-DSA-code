import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Number: ");
            int number=sc.nextInt();
        if(number==2){
            System.out.print("Prime");
        }  
        else{
            boolean isPrime=true;
        for(int i=2; i<=Math.sqrt(number);i++ ){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
        }
}
    }
}
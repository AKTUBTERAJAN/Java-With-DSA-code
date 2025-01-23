import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the Number is: ");
            int n = sc.nextInt();
            boolean isprime=true;
           // for(int i=2; i<=n-1; i++){
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){// n is a multiple of i (i is not equal to or n)
                    isprime=false;
                }
            }
            if(isprime==true){
                System.out.println(n+" is a Prime number");
            }
            else{
                System.out.println(n+" is not a Prime number");
            }
    }
}
}
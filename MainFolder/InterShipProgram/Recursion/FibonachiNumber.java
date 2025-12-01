import  java.util.*;
public class FibonachiNumber {

    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=Fib(n-1);
        int fnm2=Fib(n-2);
        int fbn=fnm1+fnm2;
        return fbn;

    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number to find Fibanachi: ");
            int n=sc.nextInt();
            System.out.println(Fib(n));
        }
    }
}

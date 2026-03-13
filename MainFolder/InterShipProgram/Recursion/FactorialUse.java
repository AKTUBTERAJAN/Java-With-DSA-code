import java.util.Scanner;

public class FactorialUse {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        //int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int ans=fact(n);
        System.out.println(ans);

    }
}

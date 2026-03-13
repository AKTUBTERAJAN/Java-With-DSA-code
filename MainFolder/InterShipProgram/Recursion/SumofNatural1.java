
import java.util.Scanner;

public class SumofNatural1 {
    public static int sum1(int i,int n){
        if(i>n){
            return  0;
        }
        int sum1 =i+sum1(i+1,n);
        return  sum1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int ans=sum1(i,n);
        System.out.println(ans);
    }
}

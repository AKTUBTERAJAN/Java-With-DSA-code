import java.util.Scanner;

public class ProducutofN {
    public static int product(int i,int n){
        if(i>n){
            return  1;
        }
        int sum1 =i*product(i+1,n);
        return  sum1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int ans=product(i,n);
        System.out.println(ans);
    }
}

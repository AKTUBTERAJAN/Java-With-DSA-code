
import java.util.Arrays;

public class leetprisurfix {
    public static int[] Prifix(int num[]) {
        int n= num.length;
        int[] prifix=new int[n];
        int surfix[]=new int[n];

        prifix[0]= num[0];
        for(int i=1; i<=n;i++){
            prifix[i]=prifix[i-1]*num[i];
        }

        surfix[n-1]=num[n-1];
        for(int i=n-2; i>0;i--){
            surfix[i]=surfix[i+1]*num[i];
        }
        int res[]=new int[n];
        for(int i=1;i<=n;i++){
            res[0]=prifix[i-1]*surfix[i+1];
        }
        res[0]=surfix[1];
        res[n-1]= prifix[n-2];
        return res;
        
    }
public static void main(String[] args){
    int num []= { -1,1,0,-3,3};
    System.out.println(Arrays.toString(Prifix(num)));
}
     
}
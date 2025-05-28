
import java.util.Arrays;

public class leetcode {
     public static int[]  leetcode238(int num[]){
        int n= num.length;
        int [] res= new int[n];

        for(int i=0; i<n; i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(j!=i){
                product=product*num[j];

                }
            }
                res[i]=product;

        }
        return res;
     }
    public static void main(String[] args) {
       // int [] num={1,2,3,4};
        int [] num={-1,1,0,-3,3};
        System.out.println(Arrays.toString(leetcode238(num)));
    }
    
}

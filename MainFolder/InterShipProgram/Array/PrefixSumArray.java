
import java.util.Scanner;

public class PrefixSumArray {
    //print Sub Array
    public static void PrefixSumArray1(int  number[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];

        prefix[0]=number[0];
        // calculate the Prefix Array
        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        //outer loop
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length;j++){
                for(int k=i; k<=j; k++){
                    currSum+=number[k];
                }
                
                currSum= i== 0? prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum< currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum is : "+maxSum);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Size of Element: ");
            int size=sc.nextInt();

            System.out.println("Enter the "+size+" Number ");
            int number[]= new int[size];
            for(int i=0; i<number.length;i++){
                number[i]=sc.nextInt();
            }
            PrefixSumArray1(number);
        }
    }
}

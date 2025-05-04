import java.util.Scanner;

public class SumOfSubArray {
    public static void maxSubArray(int number[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
    
        // Start 
        for(int i=0; i<number.length;i++){
            for(int j=i; j<number.length;j++){
                for(int k=i;k<=j; k++){
                    //Sum of Sub Array
                    currSum+=number[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                if(minSum>currSum){
                    minSum=currSum;
                }
            }
        }
        System.out.println("Max Sum is :"+maxSum);
        System.out.println("Min Sum is: "+ minSum);
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter The Number of element: ");
            int size= sc.nextInt();

            int number[]=new int [size];
            System.out.println("Enter the "+size+" Number");
            for(int i=0; i<number.length; i++){
                number[i]=sc.nextInt();
            }
            maxSubArray(number);

        }
    }
}

import java.util.Scanner;

public class KadansAlgoMax {
    public static void KadansAlgoMax1(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0; i<number.length;i++){
            currSum=currSum+number[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.println("Our Max Subarray is : "+maxSum);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Size Of Array: ");
            int size =sc.nextInt();

            int number[]= new int[size];
            System.out.println("Enter the "+size+" number");
            for(int i=0; i<number.length; i++){
                number[i]= sc.nextInt();
            }
            KadansAlgoMax1(number);
        }
    }
    
}

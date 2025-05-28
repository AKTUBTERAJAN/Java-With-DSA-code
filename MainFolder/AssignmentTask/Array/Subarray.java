
import java.util.Scanner;

public class Subarray {
    public static void AllArray(int number[]) {
        int ts=0;
        //start
        for(int i=0;i<number.length;i++){
            //end
            for(int j=i; j<number.length;j++){
                //subArray
                for(int k=i; k<=j;k++){
                    System.out.print(number[k]+" ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total SubArray is : "+ts);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of array");
            int size= sc.nextInt();

            int number[]=new int[size];
            System.out.println("Enter the "+size+" number");
            for(int i=0; i<number.length;i++){
                number[i]=sc.nextInt();
            }
            AllArray(number);
        }
    }
    
}

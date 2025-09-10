
import java.util.Scanner;

public class BubbleSort1 {
    public static void BubbleSort(int arr[] ) {
        for(int turn=0; turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void Printarr(int arr[]) {
        System.out.print("The Sorted Array is: [ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        try(Scanner sc=new  Scanner(System.in)){
            System.out.print("Enter the Size of Array: ");
            int size=sc.nextInt();

            int []arr= new int[size];
            System.out.print("Enter the "+size+" element: ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            } 
            BubbleSort(arr);
            Printarr(arr);
        }
       
    }
}

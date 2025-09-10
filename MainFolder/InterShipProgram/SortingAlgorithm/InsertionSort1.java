
import java.util.Scanner;

public class InsertionSort1 {
    public static void Sort1(int arr[] ) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            //find out correct position 
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void Printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter The Size Of Array is: ");
            int Size=sc.nextInt();

            int arr[]=new int[Size];
            System.out.print("Enter the "+Size+" element");
            for(int i=0;i<Size;i++){
                arr[i]=sc.nextInt();
            }
            Sort1(arr);
            Printarr(arr);
        }
    }
}

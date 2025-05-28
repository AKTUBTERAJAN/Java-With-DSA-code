import java.util.Scanner;

public class Selectionsort1 {
    public static void Sort1(int arr[] ) {
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            //swap
            int tem=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=tem;
        }
    }
    public static void Printarr(int arr[] ) {
        System.out.print("The Sorted array is: [");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the Size of Array: ");
        int Size =sc.nextInt();

        int arr[]=new int[Size];
        System.out.print("Enter the "+Size+" Element");
        for(int i=0; i<Size;i++){
            arr[i]=sc.nextInt();
        }
        Sort1(arr);
        Printarr(arr);
    }
}
}
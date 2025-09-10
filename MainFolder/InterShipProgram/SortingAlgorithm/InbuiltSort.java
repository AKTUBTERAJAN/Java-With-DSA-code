import java.util.Arrays;

public  class  InbuiltSort{
    public static void Printarr(int arr[] ) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void Printarr1(int arr1[] ) {
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
 public static void main(String[] args) {
     int arr[]={5,3,6,4,2,1};
     int arr1[]={5,3,6,4,2,1};
     
     // Insrtion Sort
     Arrays.sort(arr);
     Printarr(arr);
     Arrays.sort(arr1,0,3);
     Printarr1(arr1);

 }
}
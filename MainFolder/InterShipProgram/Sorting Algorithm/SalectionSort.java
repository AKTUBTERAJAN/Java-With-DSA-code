public class SalectionSort {
    public static void Sort(int arr[] ){
        for(int i=0; i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos]> arr[j]){
                    minPos=j;
                }
            }
            //swap
            int tem=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=tem;
        }
    }public static void Printarr(int arr[]) {
        System.out.print("The Sorted Array is: [ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int arr []={5,4,1,2,3};
        Sort(arr);
        Printarr(arr);
    }
}


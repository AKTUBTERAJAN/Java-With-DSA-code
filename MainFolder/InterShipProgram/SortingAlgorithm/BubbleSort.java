
public class BubbleSort {
    public static void BubbleSort1(int arr []) {
        
        for(int turn=0;turn<arr.length-1;turn++){
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
        System.out.print("The Sorted array is: [ ");
        for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.err.println("]");
        
    }
    public static void main(String[] args) {
        int []arr={5,4,1,2,3};
        BubbleSort1(arr);
        Printarr(arr);
    }
}

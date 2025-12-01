public class QuickSort{
    public static void QuickSort1(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kam
        int pidx=partition(arr,si,ei);
        //left part
        QuickSort1(arr, si, pidx-1);
        //right part
        QuickSort1(arr, pidx+1, ei);
}
    public static int partition(int arr[],int si,int ei) {
        int pivot=arr[ei];
         int i=si-1;//jagah banana
        
         for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
         }
                i++;
                //swap
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;
    }
     public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        QuickSort1(arr, 0, arr.length-1);
        printarr(arr);
    }
}
public class InsertionSort {
    public static void Sort(int arr[] ) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int priv=i-1;
            // finding out the correct position 
            while(priv>=0 && arr[priv]>curr)// accending order sorting
            //while(priv>=0 && arr[priv]<curr) Decending order sorting
            {
                arr[priv+1]=arr[priv];
                priv--;
            }
            //insrtion
            arr[priv+1]=curr;
        }
    }
    public static void Printarr(int arr[] ) {
        System.out.print("The Sorted Array is: [ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,2,3};
        Sort(arr);
        Printarr(arr);

    }
}

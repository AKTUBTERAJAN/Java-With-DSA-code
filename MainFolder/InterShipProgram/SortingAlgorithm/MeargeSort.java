public class MeargeSort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 

    public static void MeargeSort1(int arr[],int si,int ei) {
        //Base Case
        if(si>=ei){
            return;
        }
        //Kam
        int mid=(si+ei)/2;
        //Left Side
        MeargeSort1(arr, si, mid);
        //rigt
        MeargeSort1(arr, mid+1, ei);
        
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        //left
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp part

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
                
            }
        }
        //left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to orignal arr
        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        MeargeSort1(arr, 0, arr.length-1);
        printarr(arr);
    }
}

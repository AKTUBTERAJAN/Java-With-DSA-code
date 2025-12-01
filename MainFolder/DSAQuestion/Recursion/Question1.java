//Print all Occurencess of given array

public class Question1{
    public static void alloccurence(int arr[],int key,int i){
        //Base Case
        if(i==arr.length){
            return;
        }

        //kam
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        alloccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        alloccurence(arr, key, 0);
        System.out.println();
    }
}
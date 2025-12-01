public class FirstOccurence{
    public static int firstOccurence1(int arr[],int key,int i){
        //Base Cae
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return  firstOccurence1(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println( firstOccurence1(arr, 5, 0));
    }
}
public class LastOccurence {
     public static int lastOccurence1(int arr[],int key,int i){
               //Base Case
        if(i==arr.length){
            return -1;
        } 
        int isFound=lastOccurence1(arr, key, i+1);
        if(isFound ==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={5,5,5,5,5,5};
        System.out.println(lastOccurence1(arr, 5, 0));
    }
}

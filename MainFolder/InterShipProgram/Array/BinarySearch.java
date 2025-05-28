public class BinarySearch {
    public static int BinarySearch1(int number[],int key) {
        int start=0,end=number.length-1;
        while (start<=end) { 
            int mid =(start+end)/2;
            // Camaprition
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1; // left side
            }
            else{
                end=mid-1; // Right side
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        //int number[]={4,5,6,7,0,1,2};
        int key=10;
         int result= BinarySearch1(number, key);
            if(result== -1){
                System.out.print(key+" not Found in the Array");
            }
            else{
                System.out.println(key+" is Found in the Array at Index: "+result);
            }

    }
}

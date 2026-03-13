import java.util.*;
public class PalindromNumber {
    public static boolean check(int arr[],int start,int end){

        //base case
        if(start<end){
            return true;
        }
        if(arr[start]!=arr[end]){
            return  false;
        }

        //recursive case
        return check(arr, start+1, end-1);

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();//size of array

            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            boolean isPain= check(arr,0,n-1);
            if(isPain==true){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }
        }
    }
}

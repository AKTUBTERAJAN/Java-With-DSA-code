
import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearch1(int number[],int  key) {
        int start=0, end=number.length-1;
        while(start<=end){
           int mid=(start+end)/2;

           if(number[mid]==key){
                return mid;
           }
           if(number[mid]<key){
            start=mid+1;
           }
           else{
            start=mid-1;
           }
        }


        return -1;
        
    }
        
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the size of array: ");
            int size=sc.nextInt();

            int number[]=new int[size];
            System.out.println("Enter the "+size+"number");
            for(int i=0;i<number.length;i++){
                number[i]=sc.nextInt();
            }

            System.out.print("Enter the Number to search: ");
            int key=sc.nextInt();

            int index=BinarySearch1(number, key);
            if(index== -1){
                System.out.println(key+" is not found in the array");
            }
            else{
                System.out.println(key+" is Found at Index is : "+ index);
            }
        }
        
    }
}

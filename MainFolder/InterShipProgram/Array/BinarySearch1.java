
import java.util.Scanner;

public class BinarySearch1 {
    public static int BinarySearch2(int number[],int key) {
        int start=0,end=number.length-1;
        while (start<=end) { 
            int mid =(start+end)/2;
            // Camaprition
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the How Many element to Search: ");
            int size=sc.nextInt();
            
            int number[]=new int[size];
            System.out.println("Enter"+size+"Sorted element: ");
            for(int i=0;i<size;i++){
                number[i]=sc.nextInt();
            }
            System.out.print("Enter the Number to Search: ");
            int key =sc.nextInt();

            int result= BinarySearch2(number, key);
            if(result== -1){
                System.out.print(key+" not Found in the Array");
            }
            else{
                System.out.println(key+" is Found in the Array at Index: "+result);
            }

        }
    }
}

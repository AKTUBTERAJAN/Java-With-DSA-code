
import java.util.Scanner;

public class RevesedArray {
    public static int Revese(int number[]) {
        int start=0,end=number.length-1;
        while (start<end) { 
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end--;
        }
        return end;
        
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the How Many element to Take: ");
            int size=sc.nextInt();

            int number[]=new int[size];
            System.out.println("Enter "+size+" number");
            for(int i=0; i<size;i++){
                number[i]=sc.nextInt();
            }
            Revese(number);
            for(int i=0;i<number.length;i++){
                System.out.print(number[i]+" ");
            }
            System.out.println();
        }
    }
}

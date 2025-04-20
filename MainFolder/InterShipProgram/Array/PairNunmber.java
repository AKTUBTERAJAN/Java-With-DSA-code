
import java.util.Scanner;

public class PairNunmber {
    public static void pair1(int number[]) {
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1; j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Number Of Element To Print: ");
            int size= sc.nextInt();

            int number[]= new int [size];
            System.out.println("Enter the "+size+" Number");
            for(int i=0; i<number.length; i++){
                number[i]=sc.nextInt();
            }
            pair1(number);

        }
    }
}

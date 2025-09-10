
import java.util.Scanner;

public class  CreatingMatrix{
    public static boolean Saerch(int arr[][] ,int key) {
         for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println(key+" is found at sell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return  false;
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the Total number of array: ");
            int arr[][]=new int[3][3];
              int n=3,m=3;

        for(int i=0;i<n; i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //outer
        
        for(int i=0;i<n; i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        Saerch(arr, 5);
        }
    }
}
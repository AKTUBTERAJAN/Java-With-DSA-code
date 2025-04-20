import java.util.Scanner;

public class LargestSmall {
      public static int LargestSmall1(int number[]) {
        int largest=Integer.MIN_VALUE;// Largest Value find
        int smallLest=Integer.MAX_VALUE;// smalest value


        for(int i=0; i<number.length;i++){
            if (largest<number[i]) {
                largest=number[i];
            }
            if(smallLest>number[i]){
                smallLest=number[i];
            }
            
        }
        System.out.println("Sammlest Number is: "+smallLest);

        return largest;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the How Many Number To enter: ");
            int size=sc.nextInt();
            int number[]=new int[size];
            System.out.println("Enter"+size+"Number Use To SPace");
            for(int i=0; i<size; i++){
                number[i]=sc.nextInt();
            }
        System.out.println("Largest Value is: "+LargestSmall1(number));
        

        }
    }
}

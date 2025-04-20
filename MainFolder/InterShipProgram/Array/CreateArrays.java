
import java.util.Scanner;

public class CreateArrays {
    public static void main(String[] args) {
        int marks[]=new int[50];
        try(Scanner sc=new Scanner(System.in)){
           System.out.print("Enter the Pysics Mark: ");
           marks[0]=sc.nextInt();//physics

           System.out.print("Enter the chemistry Mark: ");
           marks[1]=sc.nextInt();//chemestry

           System.out.print("Enter the Math Mark: ");
           marks[2]=sc.nextInt();//math



            //int phy;
           // phy =sc.nextInt();
           System.out.println("phy: "+marks[0]);
           System.out.println("che: "+marks[1]);
           System.out.println("math: "+marks[2]);

           marks[2]=100;
           System.out.println(" Update math Marks: "+marks[2]);

           marks[2]=marks[2]+1;
           System.out.println(" Update math Marks: "+marks[2]);

        }
    }
}

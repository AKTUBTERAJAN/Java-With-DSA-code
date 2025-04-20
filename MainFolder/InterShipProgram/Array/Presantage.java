
import java.util.Scanner;

public class Presantage {
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

           int prasantage=(marks[0]+marks[1]+marks[2] )/3;
           System.out.println("Presantage: "+prasantage);
    }
    
}
}

import java.util.Scanner;

public class Lengthstring {
    public static void main(String[] args) {
        System.out.print("Enter the Name: ");

        try(Scanner sc= new Scanner(System.in)){
            String fullname;
            fullname=sc.nextLine();
        System.out.println("Total number of Character is : "+fullname.length());
            
        }
    }
}

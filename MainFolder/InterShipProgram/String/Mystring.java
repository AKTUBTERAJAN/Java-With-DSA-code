
import java.util.Scanner;

public class Mystring {
    public static void main(String[] args) {
        char arr []= { 'a','b','c'};
        String str = "abcd";
        String str2 = new String("xyz");

        // String are a immutable
            System.out.print("Enter the Name: ");

        try(Scanner sc= new Scanner(System.in)){
            String name;
            name=sc.nextLine();
            System.out.println(name);
        }
    }
}

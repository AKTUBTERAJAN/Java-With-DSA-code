import java.util.Scanner;

public class newstring {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String a = sc.nextLine(); // Or sc.next() for a single word
            System.out.println("Hi my name is " + a);
        }
    }
}

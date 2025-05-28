import java.util.Scanner;

public class LinearSearch {
    public static int linear(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i; // Return the actual index
            }
        }
        return -1; // Key not found
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the Size of Array : ");
            int Size=sc.nextInt();

            int number[] = new int[Size];
            System.out.println("Enter the "+Size+" Number");
            for(int i=0; i<number.length; i++){
                number[i]=sc.nextInt();
            }

            System.out.print("Enter the Number to Search: ");
            int key =sc.nextInt();

            int index = linear(number, key);
            if (index == -1) {
                System.out.println(key+" is  not found");
            } else {
                System.out.println(key+" found is at index: " + index);
            }
        }
    }
}

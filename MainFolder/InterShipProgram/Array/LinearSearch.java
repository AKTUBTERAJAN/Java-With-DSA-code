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
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the key to search: ");
            int key = sc.nextInt();
            
            int index = linear(number, key);
            if (index == -1) {
                System.out.println("Key not found");
            } else {
                System.out.println("Key is at index: " + index);
            }
        }
    }
}

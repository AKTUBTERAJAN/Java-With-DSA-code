
public class Linear1 {
     public static int linear(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i; // Return the actual index
            }
        }
        return -1; // Key not found
    }
    public static void main(String[] args) {
            int number[]={10,20,30,40,50};
            int key=40;
            
            int index = linear(number, key);
            if (index == -1) {
                System.out.println(key+" is  not found");
            } else {
                System.out.println(key+" found is at index: " + index);
            }
        }
    }


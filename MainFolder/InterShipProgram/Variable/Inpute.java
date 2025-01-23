
import java.util.*;

public class Inpute {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        
            //next()  -only use to Single character  not use to any space [Only print Frist Name Rajan]
            //System.out.print("Enter the Charcater: ");
            // String input= sc.next(); 
            //System.out.println(input);        
            
            // nextLine()   -Print the character is using Space  [Print Full NameRajan Kushwaha]
            //System.out.print("Enter the Character: ");
            //String name= sc.nextLine();
            //System.out.println(name);

            //Print Inter Number
            //System.out.print("Enter the Intiger Number: ");
            //int numner = sc.nextInt();
            //System.out.println(numner);

            //Print Float Number
            //System.out.print("Enter the Float Number: ");
            //float number = sc.nextFloat();
            //System.out.println(number);

            //Print boolean 
            //System.out.print("Enter the Boolean character: ");
            //boolean word = sc.nextBoolean();
            //System.out.println(word);

            // Print Double character
            //System.out.print("Enter the Number: ");
            //double number = sc.nextDouble();
            //System.out.println(number);

            // print Short
            //System.out.print("Enter the NextShort: ");
            //short number = sc.nextShort();
            //System.out.println(number);

            //Print LongShort
            System.out.print("Enter the Number: ");
            long number = sc.nextLong();
            System.out.println(number);

            sc.close();
        }    

    }
    
}

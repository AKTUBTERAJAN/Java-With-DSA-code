
import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Age: ");
            int age = sc.nextInt();
            // else if (not Check this line if first line is true if first line is false then check)
            if(age>=18){
                System.out.println("adult : drive , vote");
            }
             else if(age>=13 && age<18){    
                System.out.println("Teenager");
            }
            else{
                System.out.println("child");
            }
        }   
    }
}

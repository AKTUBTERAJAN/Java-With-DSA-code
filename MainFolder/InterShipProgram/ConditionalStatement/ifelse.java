import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        try(Scanner sc = new  Scanner(System.in)){
            System.out.print("Enter The Age:");
            float age = sc.nextFloat();
            // if-if (check both if condition चाहे पहला  condition क्यों न सही हो पर दूसरा condition check होगा )
            if(age>=18){
                System.out.println("adult : drive , vote");
            }
            if(age>13 && age<18){
                System.out.println("Teenager");
            }
            else{
                System.out.println("not adult");
         
           }
        }
    }
}

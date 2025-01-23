
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The First Number: ");
            float a = sc.nextFloat();
            System.out.print("Enter The Second Number: ");
            float b= sc.nextFloat();
            System.out.print("Enter The Operator(+ - * / %): ");
            char operator = sc.next().charAt(0);
            switch(operator){
                case '+' : System.out.println("The Sum Of A and B is: "+(a+b));
                case '-' : System.out.println("The Substraction Of A and B is: "+(a-b));break;
                case '*' : System.out.println("The Multiplication Of A and B is: "+(a*b));break;
                case '/' : System.out.println("The Divition Of A and B is: "+(a/b));break;
                case '%' : System.out.println("The Modular Of A and B is: "+(a%b));break;
                default : System.out.println("Not Advance Calculator Show  only Perform Some Limited Operation");
            }
        }
    }
    
}

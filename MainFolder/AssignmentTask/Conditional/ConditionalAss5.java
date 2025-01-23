import java.util.Scanner;

public class ConditionalAss5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Inpute The Year: ");
            int year = sc.nextInt();
             boolean x =(year % 4)== 0;
             boolean y= (year % 100)!=0;
             boolean z=(year%100==0)&& (year%400==0);
             if (x && (y||z)){
                System.out.println(year+" is a leap Year");
             }
            else{
                System.out.println(year+" is not a leap Year");
            }

             
                    
        }
    }
}

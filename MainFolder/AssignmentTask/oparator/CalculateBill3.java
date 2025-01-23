
import java.util.Scanner;

public class CalculateBill3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter The Pencil Cost: ");
            float pencil = sc.nextFloat();
            System.out.print("Enter The Pen Cost: ");
            float pen = sc.nextFloat();
            System.out.print("Enter The eraser Cost: ");
            float eraser = sc.nextFloat();
            float total = pencil+pen+eraser;
            System.out.println("The Total Bill is: "+total);

            float new_taotal = total+(0.18f*total);
            System.out.println("The NewTotal Bill include 18%Gst is: "+new_taotal);
            
        }
    }
    
}

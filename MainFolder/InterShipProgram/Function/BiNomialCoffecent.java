import java.util.Scanner;


public class BiNomialCoffecent {
    public static int  Factorial1(int num ){
        int f=1;
        for (int i=1; i<=num;i++) {
            f=f*i;
        }
                return f;
       

    }
    public static int BiNomialCoffecent1(int n ,int r){
        int fact_n=Factorial1(n);
        int  fact_r=Factorial1(r);
        int fact_nmr=Factorial1(n-r);
        
        int BiNomialCoffecent1=fact_n/(fact_r*fact_nmr);
        return BiNomialCoffecent1;
    }
    
    
    public static void main(String[] args) {
         try(Scanner sc=new  Scanner(System.in)){
            System.out.print("Enter The Value Of n: ");
            int n=sc.nextInt();
            System.out.print("Enter the Value Of r: ");
            int r=sc.nextInt();
            System.out.println("The Binomial Between "+ n +" to "+ r +" is: "+BiNomialCoffecent1(n, r));

            
        }
        
    }
}

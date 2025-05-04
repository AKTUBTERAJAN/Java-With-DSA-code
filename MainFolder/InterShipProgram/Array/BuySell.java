import java.util.Scanner;

public class BuySell {
    public static void bysell(int prices[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }

        System.out.println("The Max Price is: "+maxProfit);
        
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the Size of Array : ");
            int Size =sc.nextInt();

            int prices[]=new int[Size];
            System.out.println("Enter the "+Size+" Price ");
            for(int i=0; i<prices.length;i++){
                prices[i]=sc.nextInt();
            }
            bysell(prices);
        }

    }
}

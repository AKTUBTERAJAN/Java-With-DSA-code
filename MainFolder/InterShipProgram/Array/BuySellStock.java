public class BuySellStock {
    public static void buysell(int prices[]) {
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
            int prices[]={7,1,5,3,6,4};
            buysell(prices);
        }

    }


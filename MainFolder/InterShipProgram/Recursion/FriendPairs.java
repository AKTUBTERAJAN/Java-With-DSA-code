public class FriendPairs {
    public static int pairs(int n){
        //base case
        if(n==1|| n==2){
            return n;
        }
        //choise

        //single
                    //int fnm1=pairs(n-1);

                    //int fnm2=pairs(n-2);
                    //int pairsways=(n-1)*fnm2;

        //total ways
                //int totalway=fnm1+pairsways;
                //return totalway;
        
        //all code convert in single line
        return  pairs(n-1) + (n-1)*pairs(n-2);
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(pairs(n));
    }
}

public class OptimizePower {
    public static int Power(int a,int n){
        //base case
        if(n==0){
            return 1;
        }
        int halfpower =Power(a, n/2);
        //n is even
        int halfpowsq =halfpower*halfpower;

        //n is odd
        if(n%2!=0){
            halfpowsq= a*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String args[]){
        int a=2;
        int n=5;
        System.out.println( Power(a, n));
    }
}

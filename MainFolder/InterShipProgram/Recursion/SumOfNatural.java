public class SumOfNatural {
    public static int SumN(int n){
        if(n==1){
            return 1;
        }
        int Snm1=SumN(n-1);
        int Sm=n+SumN(n-1);
        return Sm;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(SumN(n));
    }
}

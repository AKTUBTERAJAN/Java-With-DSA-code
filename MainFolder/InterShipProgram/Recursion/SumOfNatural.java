public class SumOfNatural {
    public static int SumN(int n){
        if(n==1){
            return 1;
        }
        //int Snm1=SumN(n-1);
        int Sm1=n+SumN(n-1);
        return Sm1;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(SumN(n));
    }
}

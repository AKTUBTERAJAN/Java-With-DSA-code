public class BinaryClearRange {
    public static int clearbit(int n,int i, int j){
        int a=(~0)<<(j+1);
        int b= (1<<i)-1;
        int bitmarks= a|b;
        return n & bitmarks;
    }
    public static void main(String args[]){
        System.out.println( clearbit(10,2,4));
    }
}

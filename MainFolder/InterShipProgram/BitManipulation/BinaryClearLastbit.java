public class BinaryClearLastbit {
    public static int clearlastbit(int n,int i){
        int bitmarks=(~0)<<i;
        return n  & bitmarks;
    }
public static void main (String ars[]){
    System.out.println(clearlastbit(15, 2));
    }
}

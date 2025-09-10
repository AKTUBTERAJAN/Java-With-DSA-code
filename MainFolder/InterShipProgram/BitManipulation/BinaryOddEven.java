public class BinaryOddEven {
    public static void oddeven(int n){
        int bitmask= 1;
        if((n& bitmask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        oddeven(3);
        oddeven(11);
        oddeven(40);

    }
}

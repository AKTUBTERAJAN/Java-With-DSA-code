public class Binaryithclear {
    public static int setithclear(int n,int i){
        int bitmarks=~(1<<i);
        return n & bitmarks ;
    }
    public static void main(String args[]){
        System.out.println(setithclear(10, 1));

    }
}

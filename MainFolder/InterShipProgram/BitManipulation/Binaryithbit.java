public class Binaryithbit {
    public static int setithbit(int n,int i){
        int bitmarks=1<<i;
        return n | bitmarks;
    }
    public static void main(String args[]){
        System.out.println(setithbit(10, 2));
    }
}

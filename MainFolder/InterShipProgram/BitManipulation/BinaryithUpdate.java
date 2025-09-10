public class BinaryithUpdate {
    public static int setithbit(int n,int i){
        int bitmarks=1<<i;
        return n | bitmarks;
    }
    public static int setithclear(int n,int i){
        int bitmarks=~(1<<i);
        return n & bitmarks ;
    }
    public static int update(int n ,int i,int newbit){
        if(newbit == 0){
            return setithclear(n, i); 
        }
        else{
            return setithbit(n, i);
        }
    }
    public static void main(String args[]){
        System.out.println(update(10, 2, 1));

    } 
}

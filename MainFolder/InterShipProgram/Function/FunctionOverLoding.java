public class FunctionOverLoding {
    public static int sum(int a ,int b){
        return a+b;
    }
    public static float sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
    System.out.println(sum(5,2));
    System.out.println(sum(5,2,3));
    System.out.println(sum(5,2,7,8));
    }
    
}

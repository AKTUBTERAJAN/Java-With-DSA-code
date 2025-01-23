public class OverLodingDatatype {
    // function to calulate interger sum
    public static int sum(int a,int b){
        return a+b;
    }
    // function to calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }
    // main function
    public static void main(String[] args) {
        System.out.println(sum(5,2));
        System.out.println(sum(5.2f,2.f));
    }
}

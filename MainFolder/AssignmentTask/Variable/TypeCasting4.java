public class TypeCasting4 {
    public static void main(String[] args) {
        byte b = 4;
        char c='a';
        short s =512;
        int i = 100;
        float f=3.14f;
        double d = 99.9954;
        double  Result = (f*b)+(i%c)-(d*s);
        System.err.print(Result);
    }
    
}

//Print the number in form of String
//Example-2047 (two zero four seven)

public class Question2{
    static String digit[]={"Zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigit(int num){
        if(num==0){
            return;
        }
        int lastdigiit=num%10;
        printdigit(num/10);
        System.out.print(digit[lastdigiit]+" ");
    }
    public static void main(String args[]){
        int num=2047;
        printdigit(num);
    }
}
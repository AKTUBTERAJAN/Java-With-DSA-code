
public class ReverseArray1 {
     public static int Revese(int number[]) {
        int start=0,end=number.length-1;
        while (start<end) { 
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end--;
        }
        return end;
        
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
            Revese(number);
            for(int i=0;i<number.length;i++){
                System.out.print(number[i]+" ");
            }
            System.out.println();
        }
    }
    



public class PairNumber1 {
     public static void pair1(int number[]) {
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1; j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")"+" ");
                tp++;

            }
            System.out.println();
        }
        System.out.println("Total Pair is: "+tp);
    }
    public static void main(String[] args) {
        int number[]= {2,3,4,5,6};
        pair1(number);

        }
    }


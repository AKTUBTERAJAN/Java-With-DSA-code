
public class SubArray1 {
    public static void Sub1(int number[]) {
        int ts=0;
        // Start 
        for(int i=0; i<number.length;i++){
            for(int j=i; j<number.length;j++){
                for(int k=i;k<=j; k++){
                    System.out.print(number[k]+" ");
                }
                ts++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.print("total Sub Array is: "+ts);
    }
    public static void main(String[] args) {
        int number[]={2,3,4,5,6};
        Sub1(number);

    }
}

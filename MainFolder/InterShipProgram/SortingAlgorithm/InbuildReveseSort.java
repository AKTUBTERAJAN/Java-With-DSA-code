import  java.util.Arrays;
import java.util.Collections;

public class InbuildReveseSort {
    public static void Printarr(Integer arr[] ) {
        for(Integer i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={5,3,4,1,2};
        Arrays.sort(arr,Collections.reverseOrder());
        Printarr(arr);
    }
}

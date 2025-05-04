
import java.util.Scanner;

public class TrappingRainWater {
    public static void Trapping(int height[]) {
        int n=height.length;
        // calculate left max boundary-array(Axilary array)
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        // calculate Right max boundary-array(Axilary array)
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappewater=0;
        //loop
        for(int i=0;i<n;i++){
        //waterLevel=min{left max boundary-right max boundary}
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
        //trap water=waterlevel-height[i]
            trappewater += waterlevel-height[i];
        }
        System.out.println("The Total Water are Occupied is:  "+trappewater);
    }
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter the Size of Array: ");
            int size=sc.nextInt();

            int height[]= new int[size];
            System.out.println("Enter the "+size+" height" );
            for(int i=0; i<height.length; i++){
                height[i]=sc.nextInt();
            }
            Trapping(height);
        }
        
    }
}

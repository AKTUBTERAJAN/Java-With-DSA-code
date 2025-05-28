public class leetcodeRotedBinary {
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int left = 0;
        int right = n- 1;
        while (left <right) {
            int mid = (left + right) / 2;
            if (nums[mid]> nums[right]) {
                left= mid+1;
            }
            
            else {
                right = mid;
            }
        }
        int shift=left;
        left=0;
        right=n-1;
        while(left<=right){

            int mid=(left+right)/2;

            int realmid=(mid+shift)% n;
            if(nums[realmid]==target){
                return realmid;
            }
            else if(nums[realmid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        //int nums[]={2,4,6,8,10,12,14,16};
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
         int result= search(nums, target);
            if(result== -1){
                System.out.print(target+" not Found in the Array");
            }
            else{
                System.out.println(target+" is Found in the Array at Index: "+result);
            }

    }
}

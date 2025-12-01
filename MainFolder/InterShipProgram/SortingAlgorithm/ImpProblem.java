// Search in rotated Array 

public class ImpProblem {
    public static int Search(int arr[],int tar,int si,int ei){
       //Base Case
       if(si>ei){
        return -1;
       }
       
        //kam
        int mid =si+(ei-si)/2;
         
        //case 1
        if(arr[mid]==tar){
            return mid;
        }

            //mid on L1
            if(arr[si]<=arr[mid]){
                    //case a : Left
                    if(arr[si]<=tar && tar<=arr[mid]){
                    return  Search(arr, tar, si, mid-1);
                    }
                    else{
                        //case b: right
                        return Search(arr, tar, mid+1, ei);
                    }
            }

            //mid on l2
            else{
                //case c: right
                if(arr[mid]<=tar && tar<=arr[ei]){
                    return Search(arr, tar, mid+1, ei);
                }
                else{
                    //case d:left
                    return Search(arr, tar, si, mid-1);
                }
            }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,};
        int tar=6;//output>4
        int tarIdx=Search(arr, tar, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}

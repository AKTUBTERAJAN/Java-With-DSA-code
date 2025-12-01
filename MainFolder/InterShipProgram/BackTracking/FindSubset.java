public class FindSubset {
    public static void subset(String str,String ans,int i){
        //Base Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null");
            }
            else{
                  System.out.print(ans+" ");
            }
          
            return;
        }

        //Recursion
            //Choise Yes
            subset(str, ans+str.charAt(i), i+1);
            
            //Choise No
            subset(str, ans, i+1);

    }
    public static void main(String args[]){
        String str="abc";
        subset(str, "", 0);
    }
}

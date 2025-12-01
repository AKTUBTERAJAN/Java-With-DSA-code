public class BinaryString {
    public static void print(int n,int lastplace,String str){
        //Base Case
        if(n==0){
         System.out.println(str);
         return;
        }
        //kam 
                //if(lastplace==0){
                //    //sit chair on n
                //    print(n-1,0, str.append("0"));
                //    print(n-1,1, str.append("1"));
                //}else{
                //    print(n-1,0, str.append("0"));
                //
                //}

        // anotherway code write in one line for without consecutive zero
                // print(n-1,1, str+"1 ");
                //if(lastplace==1){
                //        print(n-1,0,str+"0 ");
                //    }
        
         // anotherway code write in one line for without consecutive once
                 print(n-1,0, str+"0 ");
                if(lastplace==0){
                        print(n-1,1,str+"1 ");
                    }

    }
    public static void main(String args[]){
        print(3,0,"");
    }
}

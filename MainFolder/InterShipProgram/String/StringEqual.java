public class StringEqual {
    public static void main(String[] args) {
        String s1= "Rajan";
        String s2="Rajan";
        String s3=new String("Rajan");

    //       if(s1==s2){
    //        System.out.println("String are equal");
    //    }
    //    else{
    //        System.out.println("String are not eqaual");                           
    //    }
//
    //    if(s1==s3){
    //        System.out.println("String are equal");
    //    }
    //    else{
    //        System.out.println("String are not eqaual");                           
    //    }

        if(s1.equals(s3)){
            System.out.println("String are equal");
         }
         else{
          System.out.println("String are not eqaual");                           
           }
    }
}

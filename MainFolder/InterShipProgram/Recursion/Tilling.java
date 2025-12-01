public class Tilling {
    public static int floor(int n){
       //base case
       if(n==0 || n==1){
        return 1;
       }
       
        //kam
        //vertical choise
                    // int verticaltiles=floor(n-1);

        //horizental tiles
                //int horizentaltiles=floor(n-2);

                //int totalways=verticaltiles+horizentaltiles;
                //return totalways;

        //All code convert into single line
        return  floor(n-1) + floor(n-2);
    }
    public static void main(String args[]){
        int n=4;
        System.out.println( floor(n));

    }
}

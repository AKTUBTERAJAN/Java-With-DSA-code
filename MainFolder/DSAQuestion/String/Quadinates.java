public class Quadinates {
    public static float  getshortest(String path){
        int x=0 , y=0;
         for(int i=0; i<path.length(); i++){
            char direction =path.charAt(i);
            if(direction=='s'){
                y--;
            }
            else if(direction=='n'){
                y++;
            }
            else if(direction=='w'){
                x--;
            }
            else{
                x--;
            }
         }
         int x2= x*x;
         int y2=y*y;
        return  (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path  = "wneenesennn";
        System.out.println(getshortest(path));

    }
}

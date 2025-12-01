public class GetterClass {
    public static void main(String args[]){
        Body p1=new Body(); // create a pen object 
        p1.setcolor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println();
        p1.setcolor("yellow");
        System.out.println(p1.getColor());

    }
}
class Body{
   private  String color;
   private  int tip;



    String getColor(){
        return this.color;
    }

    
     void  setcolor(String newColor){
        color=newColor;
    }
    void getTip(int tip){
        this.tip=tip;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

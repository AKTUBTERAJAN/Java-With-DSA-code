public class Class1{
    public static void main(String args[]){
        Pen p1=new Pen(); // create a pen object 
        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setcolor("yellow");
        System.out.println(p1.color);



        
    }
}

class Pen{
    //pro+fun

    String color;
    int tip;

    void  setcolor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage; // CGPA

    void  calculatePercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }

}
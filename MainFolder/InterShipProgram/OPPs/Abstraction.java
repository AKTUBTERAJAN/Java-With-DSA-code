public class Abstraction {
    public static void main(String args[]){
        //Horse h=new Horse();
        //h.eat();
       // h.walk();
        //System.out.println(h.color);

       // chicken c=new chicken();
       // c.eat();
       // c.walk();
       Mustang m=new Mustang();
            //Animal-> Horse-> Mustang
    }
}


abstract class Animal{

    String color;
    // create consructor 
    Animal(){
        System.out.println("animal constructor is called");
        color="brown";
    }
    //non abstract method
    void eat(){
        System.out.println("animals eats");
    }

    //abstact method

    abstract void walk();
}

class Horse   extends  Animal{
    Horse(){
        System.out.println("Horse Constructor is called ");
    }
    void changecolor(){
        color="darkbrown";
    } 
    void walk(){
        System.out.println("walks on 4legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}

class chicken extends Animal{
    void changecolor(){
        color="yellow";
    }
    void  walk(){
        System.out.println("walks on 2 legs");
    }
}
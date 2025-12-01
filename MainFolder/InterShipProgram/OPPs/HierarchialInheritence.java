public class HierarchialInheritence {
    public static void main(String[] args) {
        Fish jeFish= new Fish();
        jeFish.swim();
        jeFish.eat();
        jeFish.breath();
        
    }
}

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");

    }
}

//Derived Class
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends  Animal{
    void  swim(){
        System.out.println("Swims");
    }
}
class Birds extends  Animal{
    void  fly(){
        System.out.println("Flying");
    }

}
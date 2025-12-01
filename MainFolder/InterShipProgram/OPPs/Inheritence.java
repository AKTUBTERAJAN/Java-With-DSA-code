public class Inheritence {
    public static void main(String args[]){
        fish shark=new fish();
        shark.eat();
    }
}

    //Base Class
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
 class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
 }

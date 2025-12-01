public class SingleInheritence {
    public static void main(String[] args) {
        fish jelFish = new fish();
        jelFish.eat();
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


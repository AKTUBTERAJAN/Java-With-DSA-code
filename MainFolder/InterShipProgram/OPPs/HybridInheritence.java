public class HybridInheritence {
    public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.eat();
        dobby.walk();
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
class Dog extends  Mammals{
    void breed(){
        System.out.println("Breeds");
    }
}
class Cats extends Mammals{
    void veryfast(){
        System.out.println("Running Very Fast");
    }
} 
class  Human extends Mammals{
    void sharp(){
        System.out.println("Human minds is sarp");
    }
}

class Fish extends  Animal{
    void  swim(){
        System.out.println("Swims");
    }
}

class Tunna extends Fish{
    void fast(){
        System.out.println("Fasts");
    }
}

class Shark extends Fish{
    void larg(){
        System.out.println("larges");
    }
}
class Birds extends  Animal{
    void  fly(){
        System.out.println("Flying");
    }

}

class peacock extends  Birds{
    int swins;
}

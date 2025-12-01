public class MultilevelInheritence {
    public static void main(String[] args) {
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        dobby.color="Brown";
        System.out.println(dobby.color);
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
}

class Dogs extends  Mammals{
    String breed;
}
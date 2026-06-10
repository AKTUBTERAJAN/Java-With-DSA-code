public class MethodOverloding {
    public static void main(String[] args) {
        display d=new display();
        d.display();
        d.display("Alice", 25);
    }
}

class  display{
    String name;
    int age;
    int rollno;
    
    void display(){
        System.out.println("display");
    }
    void display(String n,int a){
        name=n;
        age=a;
        System.out.println(name + " is " + age + " years old");
    }
    void display(int a,String n){
        name=n;
        age=a;
        System.out.println("Roll number: " + rollno);
        System.out.println("Age: " + age);
    }
}

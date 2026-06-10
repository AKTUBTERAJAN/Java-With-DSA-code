public class Teacher{
    public static void main(String args[]){
        Teacher1 t1 = new Teacher1();
        t1.id = 101;
        t1.name = "Mr. Sharma";
        t1.age = 40;
        t1.salary = 50000;
        t1.subject = "Mathematics";

        t1.teach();
    }
}

class Teacher1{
    int id;
    String name;
    int age;
    int salary;
    String subject;

    void teach(){
        System.out.println("Teacher ID: " + id);
        System.out.println(name + " is teaching " + subject);
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " has a salary of " + salary);
    }
}
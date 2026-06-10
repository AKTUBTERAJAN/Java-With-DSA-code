public class Cass1 {
    public static void main(String args[]){
        Student s1 = new Student();
        //DOT OPERATOR-ACCESSING THE PROPERTIES AND METHODS OF THE CLASS
        s1.name = "Rohit";
        s1.age = 20;
        s1.rollno = 101;

        s1.study();


    }
}

//user define data type
class Student{
    //PROPERTIES DATA MEMBERS
    String name;
    int age;    
    int rollno;

    //MATHEODS /BEHAVIOUR
    void study(){
        System.out.println(name + " is studying");
        System.out.println(name + " is " + age + " years old");
        System.out.println(name + " has roll number " + rollno);
    }
}
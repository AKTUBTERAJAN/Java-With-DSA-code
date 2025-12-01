public class Constructor {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Rajan");
        System.out.println(s2.name);
        Student s3=new Student(123);
        System.out.println(s3.roll);

        
        //System.out.println(s1.name);
    }
    
}

class Student {
    String name;
    int roll;

     Student() { // Non Pairameterized Constructor
        //this.name=name;
        System.out.println("constructor is called...");
    }

    Student(String name){ //Pairameterized Constructor
        this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }

    
}

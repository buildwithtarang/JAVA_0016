public class Student {

    String name;
    int id ;
    String dept;
    double cgpa ;

    {
        System.out.println("Student Object Created");
        name="Unknown";
        dept="Not Assigned";

    }

    Student(){
        System.out.println("No-parameterized");
         this.display();
    }



    Student(String name,int id,String dept,double cgpa){
        this.name=name;
        this.id=id;
        this.dept=dept;
        this.cgpa=cgpa;
        this.display();


    }
    void display(){
        System.out.println("Student Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Department:"+dept);
        System.out.println("CGPA:"+cgpa);
        System.out.println();
    }

    static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Taranggo",123,"CSE",3.50);

    }
}

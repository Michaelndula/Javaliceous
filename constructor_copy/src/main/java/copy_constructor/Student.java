package copy_constructor;

public class Student {
    int id;
    String name;

    Student(int i, String n){
        id = i;
        name = n;
    }

    Student(Student s){
        id = s.id;
        name = s.name;
    }

    void display(){System.out.println("Student ID: "+id+", Student Name: "+name);}

    public static void main(String[] args){
        Student s1 = new Student(1, "Michael");
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}

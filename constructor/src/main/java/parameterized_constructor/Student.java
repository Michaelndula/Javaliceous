package parameterized_constructor;

public class Student {
    int id;
    String name;

    Student(int i, String n){
        id = i;
        name = n;
    }

    void display(){System.out.println("Student id: "+id+", Student Name: "+name);}

    public static void main(String[] args){
        Student s1 = new Student(1, "Michael");
        Student s2 = new Student(2, "Shivachi");

        s1.display();
        s2.display();
    }
}

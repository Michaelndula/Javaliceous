package overload;

public class Student {
    int id;
    String name;
    int age;

    Student(int i, String n){
        id = i;
        name = n;
    }

    Student(int i, String n, int a){
         id = i;
         name = n;
         age = a;
    }

    void display(){System.out.println("Student ID: "+id+", Student Name:"+name+", Student Age: "+age);}

    public static void main(String[] args){
        Student s1 = new Student(1, "Michael");
        Student s2 = new Student(2,"Shivachi", 25);

        s1.display();
        s2.display();
    }
}

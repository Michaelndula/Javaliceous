package static_key_word;

class Student {
    int rollno;
    String name;

    static String college = "UON";

    //constructor
    Student(int r, String n){
        rollno = r;
        name = n;
    }

    void display(){System.out.println("Student Roll No.: "+rollno+", Students name:"+name+", College:"+college);}

    public static void main(String[] args){
        Student s1 = new Student(12, "Michael");
        Student s2 = new Student(13, "Ndula");

        s1.display();
        s2.display();
    }
}

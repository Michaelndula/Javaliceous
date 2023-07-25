package object_method_intialize;

class Student {
    int rollno;
    String s_name;

    void insertInfo(int roll, String name){
        rollno = roll;
        s_name = name;
    }

    void displayInfo(){System.out.println("Student Roll No. : "+rollno+", Student Name: "+s_name);}
}

class Students{
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();

        student1.insertInfo(100, "Michael");
        student2.insertInfo(101, "Ndula");

        student1.displayInfo();
        student2.displayInfo();
    }
}



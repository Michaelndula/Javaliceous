package object_reference_initialize;
class Student {
    int s_id;
    String s_name;
}

class Student1{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.s_id = 10;
        s1.s_name = "Michael";

        System.out.println("Student ID: "+s1.s_id+", Student Name: "+s1.s_name);
    }
}

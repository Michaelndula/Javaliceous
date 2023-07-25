package classes;

class object_outside_class {
    int student_id;
    String student_name;
}

class TestStudent1{
    public static void main(String[] args){
        object_outside_class s1 = new object_outside_class();
        s1.student_id = 1;
        s1.student_name = "Michael";

        System.out.println(s1.student_id);
        System.out.println(s1.student_name);
    }
}



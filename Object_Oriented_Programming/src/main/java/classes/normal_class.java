package classes;

class normal_class {
    int student_id;
    String student_name;

    public static void main(String[] args){
        normal_class s1 = new normal_class();
        s1.student_id = 1;
        s1.student_name = "Michael Ndula";

        System.out.println("Student ID: "+s1.student_id+", Student Name: "+s1.student_name);
    }
}

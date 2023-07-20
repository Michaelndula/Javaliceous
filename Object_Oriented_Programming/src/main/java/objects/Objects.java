package objects;

public class Objects {
    int id;
    String studentName;

    public static void main(String[] args){
        Objects s1 = new Objects();
        s1.id = 1;
        s1.studentName = "Michael";

        System.out.println(s1.id);
        System.out.println(s1.studentName);
    }
}

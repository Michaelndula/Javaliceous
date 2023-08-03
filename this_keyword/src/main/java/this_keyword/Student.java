package this_keyword;

// without this keyword
class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee){
        rollno = rollno;
        name = name;
        fee = fee;
    }

    void display(){System.out.print("Without this keyword: "); System.out.println(rollno+" "+name+" "+fee);} // output will be null because parameters (formal arguments) and instance variables are same.
}

class Testthis{
    public static void main(String[] args){
        Student s1 = new Student(12, "Michael", 2300f);
        Student s2 = new Student(13, "Shivachi", 2500f);

        s1.display();
        s2.display();
    }
}


//with this keyword
class Student1{
    int rollno;
    String name;
    float fee;

    Student1(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void displaythis(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis1{
    public static void main(String[] args){
        Student1 s1 = new Student1(12, "Michael", 2300f);
        Student1 s2 = new Student1(13, "Shivachi", 2500f);

        s1.displaythis();
        s2.displaythis();
    }
}

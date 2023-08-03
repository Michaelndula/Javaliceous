package this_invoke_current_class;

class Test {
    void m(){System.out.println("hello m");}

    void n(){
        System.out.println("hello n");
        this.m();
    }
}

class Testthis{
    public static void main(String[] args){
        Test test = new Test();
        test.n();
    }
}

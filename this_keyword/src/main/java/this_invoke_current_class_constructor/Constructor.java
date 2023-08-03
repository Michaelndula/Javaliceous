package this_invoke_current_class_constructor;

class Constructor {
    Constructor(){System.out.println("hello");}

    Constructor(int i){
        this();
        System.out.println(i);
    }
}

class Testthis{
    public static void main(String[] args){
        Constructor a = new Constructor(25);
    }
}

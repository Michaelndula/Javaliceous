package covariant_return_type;

public class A {
    A get(){return this;}
}

class B extends A{
    @Override
    B get(){
        return this;
    }
    void message(){System.out.println("Welcome to covariant return type");}

    public static void main(String[] args){
        new B().get().message();
    }
}

package access_package;
import default_package.*;

class B {
    public static void main(String[] args){
        A obj = new A(); //compiler time error
        obj.msg(); // compile time error
    }
}

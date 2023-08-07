package Interface;

interface printable {
    void print();
}

class A implements printable{
    @Override
    public void print(){System.out.println("Hello");}

    public static void main(String[] args){
        A obj = new A();
        obj.print();
    }
}

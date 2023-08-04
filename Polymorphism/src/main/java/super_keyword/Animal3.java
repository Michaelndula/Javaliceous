package super_keyword;

class Animal3 {
    Animal3(){System.out.println("animal is created");}
}

class Dog2 extends Animal3{
    Dog2(){
        super();
        System.out.println("dog is created");
    }
}

class TestSuper3{
    public static void main(String[] args){
        Dog2 d = new Dog2();
    }
}

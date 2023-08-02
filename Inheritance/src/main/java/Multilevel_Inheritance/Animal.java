package Multilevel_Inheritance;

class Animal {
    void eat(){System.out.println("eating...");}
}

class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}

class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}

class TestInheritance1{
    public static void main(String[] args){
        BabyDog b = new BabyDog();
        b.weep();
        b.bark();
        b.eat();
    }
}

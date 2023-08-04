package super_keyword;

class Animal {
    String color = "white";
}

class Dog extends Animal{
    String color;

    {
        color = "black";
    }

    void printAnimal(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

class DisplayAnimal{
    public static void main(String[] args){
        Dog d = new Dog();
        d.printAnimal();
    }
}
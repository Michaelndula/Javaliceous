package method_overriding;

class Vehicle {
    void run(){System.out.println("Vehicle is running");}
}

// without method overriding
//class Bike extends Vehicle{
//    public static void main(String[] args){
//        Bike obj = new Bike();
//
//        obj.run();
//    }
//}

// method overriding
class Bike1 extends Vehicle{
    void run(){System.out.println("Bike is running");}

    public static void main(String[] args){
        Bike1 obj1 = new Bike1();

        obj1.run();
    }
}

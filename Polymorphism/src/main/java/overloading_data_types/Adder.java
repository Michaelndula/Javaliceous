package overloading_data_types;

class Adder {
    static int add(int a, int b){return a + b;}
    static double add(double a, double b){return a + b;}
}

class Overloading{
    public static void main(String[] args){
        System.out.println(Adder.add(10, 15));
        System.out.println(Adder.add(10.5, 14.5));
    }
}

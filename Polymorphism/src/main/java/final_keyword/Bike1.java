package final_keyword;

class Bike1 {
    final void run(){System.out.println("running...");}
}

class Honda extends Bike1{
    void run(){System.out.println("running safely...");}

    public static void main(String[] args){
        Honda honda = new Honda();
        honda.run();
    }
}

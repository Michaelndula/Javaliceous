package static_key_word;

class Counter {
    static int count=0; // will get memory only once and retain its value

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

class Counter1{
    int count=0; // will get memory each time when the instance is created

    Counter1(){
        count++;
        System.out.println(count);
    }

    public static void main(String args[]){
//Creating objects
        Counter1 c1=new Counter1();
        Counter1 c2=new Counter1();
        Counter1 c3=new Counter1();
    }
}

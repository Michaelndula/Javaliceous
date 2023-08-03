package method_overriding;

class Bank {
    int getRateOfInterest(){return 0;}
}

class SBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class ICIC extends Bank{
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank{
    @Override
    int getRateOfInterest() {
        return 10;
    }
}

class Display{
    public static void main(String[] args){
        SBI s = new SBI();
        ICIC i = new ICIC();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}



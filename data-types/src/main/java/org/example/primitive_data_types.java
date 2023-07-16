package org.example;

public class primitive_data_types {
    public  static void main(String[] args){
        boolean one = false; // True or False
        byte a = 10; byte b = -120; // Its minimum value is -128 and maximum value is 127. Its default value is 0.
        short s = 1000; // Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.
        int c = 20; // Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0.
        long l = 1000L; // Its minimum value is - 9,223,372,036,854,775,808 and maximum value is 9,223,372,036,854,775,807.
        float f1 = 1.24f; // Its value range is unlimited
        double d = 12.2; // Its value range is unlimited
        char letterA = 'A'; // Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)

        System.out.println("boolean is: "+ one);
        System.out.println("byte 1 is: "+ a);
        System.out.println("byte 2 is: "+ b);
        System.out.println("short is: "+ s);
        System.out.println("int is: "+ c);
        System.out.println("long is: "+ l);
        System.out.println("float is: "+ f1);
        System.out.println("double is: "+ d);
        System.out.println("character is: "+ letterA);
    }

}

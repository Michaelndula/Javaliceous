package org.example;

public class ternary_operator {
    public static void main(String args[]){
        int a=2;
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);
    }
}

//    The line of code int min = (a < b) ? a : b; is a conditional (ternary) operator in Java.
//
//        The conditional operator (a < b) ? a : b evaluates the condition (a < b). If the condition is true, the value of a is assigned to the variable min. If the condition is false, the value of b is assigned to min.
//
//        In other words, the line of code determines the minimum value between a and b and assigns it to the variable min.
//
//        Here's a breakdown of what happens:
//
//        If a is less than b, the condition (a < b) is true, so min will be assigned the value of a.
//        If a is greater than or equal to b, the condition (a < b) is false, so min will be assigned the value of b.
//        After executing this line of code, the variable min will hold the smaller of the two values a and b.

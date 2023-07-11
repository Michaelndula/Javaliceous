package org.example;
import java.util.Scanner;

//Tip Calculator
//You always tip 15% of the bill amount.
//
//To make the calculation easier, you decide to write a program that will do that for you.
//
//Task: Take the bill amount as input and output the corresponding tip amount, which should be 15% of the amount.
//
//To calculate 15% of a number, multiply it by 15, then divide by 100.

public class tipCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();

        double tip = bill * 15 / 100;

        System.out.println(tip);

    }
}

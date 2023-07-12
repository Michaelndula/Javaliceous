package org.example;
import java.util.Scanner;

//Boiling Water
//You are making a program for a water sensor that should check if the water is boiling.
//
//Take the integer temperature in Celsius as input and output "Boiling" if the temperature is above or equal to 100.
//
//Output "Not boiling" if it's not.
//
//Sample Input:
//        105
//
//Sample Output:
//        Boiling


public class boilingWater {

    static void boilStatus(){
        System.out.println("Input degrees: ");
        
        Scanner sc = new Scanner (System.in);

        int degrees = sc.nextInt();

        if(degrees >= 100){
            System.out.println("Boiling");
        }else{
            System.out.println("Not boiling");
        }
        
    }
    public static void main(String[] args){
        System.out.println();
        boilStatus();
    }

}

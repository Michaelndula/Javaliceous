package org.example;
import java.util.Scanner;

public class stringInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println(name +" is "+ age +" years old");
    }
}

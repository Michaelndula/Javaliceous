package userdefined;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int num = sc.nextInt();

        findEvenOdd(num);
    }

    public static void findEvenOdd(int num){

        if(num%2 == 0){
            System.out.print(num+" is an even number");
        }else{
            System.out.println(num+" is an odd number");
        }

    }
}

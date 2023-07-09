package org.example;

public class Sum {
   static int myArr[] = {14, 25, 3, 40, 5};

    static int sum() {
        int sum = 0;
        int i;

        for(i = 0; i < myArr.length; i++){
            sum += myArr[i];
        }
        return sum;
    }
    public  static void main(String[] args){
            System.out.println("Sum of given array is: " + sum());
        }
}

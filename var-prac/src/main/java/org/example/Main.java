package org.example;

public class Main {
    static int Arr[] = {78, 34, 1, 3, 90, 34, -1, -4, 6, 144, 55, 20, -65};

    static void ascend() {

        for(int i =0; i < Arr.length; i++){
            for(int j = i +1; j < Arr.length; j++){
               int temp = 0;

                if(Arr[i] > Arr[j]){
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
            System.out.println(Arr[i]);
        }
    }

    public  static void main(String[] args){
        System.out.println("Array after sorted: ");
        ascend();
    }
}
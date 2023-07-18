package org.example;

public class break_with_labeled_loops {
    public static void main(String[] args){
        a:
        for(int i = 0; i <= 10; i++){
            b:
            for(int j = i + 1; j <= 10; j++){
                c:
                for(int k = j + 1; k <= 10; k++){
                    System.out.println(k);
                    if(k == 5){
                        break a;
                    }
                }
            }
        }
    }
}

package com.thevarungupta;

public class Demo14 {
    public static void main(String[] args) {

        for(int i=1;i<10;i++){
            if(i == 5){
                continue;
                // will skip to the rest statement
            }
            System.out.println(i);
        }

    }
}

package com.thevarungupta;

public class Demo1 {

    static int z = 100; // static variable
    int x = 10;  // instance variable

    public static void addNumber() {

        //static int d = 10; // not allowed
        int a = 10;  // local variables
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public static void sub() {

    }


    public static void main(String[] args) {
        z = 20;
        sub();
        addNumber();
    }

}

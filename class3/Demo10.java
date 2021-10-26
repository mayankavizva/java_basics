package com.thevarungupta.Day3;

abstract class Test1 {
    abstract void display();
}

class Test2 {

}

public class Demo10 {
    public static void main(String[] args) {
        Test1 t1 = new Test1(){

            @Override
            void display() {

            }
        };
    }
}

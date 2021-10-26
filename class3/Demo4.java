package com.thevarungupta.Day3;

class Car{
    public final void drive(){
        System.out.println("driving...");
    }
}

class Honda extends Car{

//    @Override
//    public void drive() {
//        System.out.println("Honda driving...");
//    }
}

public class Demo4 {
    public static void main(String[] args) {
        Honda honda  =new Honda();
        honda.drive();
    }
}

package com.thevarungupta.Day3;

class Parent{
    public void greeting(String name){
        System.out.println("Welcome "+ name);
    }
}

class Child extends Parent{
    public void greeting(String name){
        System.out.println("Hello "+ name);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.greeting("Mark");

        Parent parent = new Parent();
        parent.greeting("Paul");
    }
}

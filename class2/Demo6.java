package com.thevarungupta.Day2;

class Parent{

    public Parent(){
        System.out.println("Parent constructor");
    }

    public int parentMember;
}

class Child extends Parent{

    public Child(){
        System.out.println("Child constructor");
    }

    public int childMember;
}

public class Demo6 {
    public static void main(String[] args) {
//        Child child = new Child()     ;
//        child.childMember = 10;
//        child.parentMember = 20;
//
//        Parent parent = new Parent();
//        parent.parentMember = 20;

        //Parent parent = new Parent();
        Child child  =new Child();

    }
}

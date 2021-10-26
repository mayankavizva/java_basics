package com.thevarungupta.Day2;

class Test{

    public int a;

    public Test(){
        System.out.println("first constructor");
    }

    public Test(int a){
        System.out.println("second constructor");
    }

    public Test(String str){
        System.out.println("third constructor");
    }

    public Test(int a, String str){
        System.out.println("fourth constructor");
    }

    public Test(String str, int a){
        System.out.println("fifth constructor");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test(10);
        Test test3 = new Test("a");
        Test test4 = new Test(1, "a");
        Test test5 = new Test("a", 1);
    }
}

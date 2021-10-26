package com.thevarungupta.Day3;

class Calculator{
    public void test(){
        System.out.println("first method");
    }

    public void test(int a){
        System.out.println("second method");
    }

    public void test(String b){
        System.out.println("third method");
    }

    public void test(int a, String b){
        System.out.println("forth method");
    }

    public void test(String a, int b){
        System.out.println("fifth method");
    }

    // not allowed
//    public int test(){
//        return 10;
//    }
}

public class Demo1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.test();
        cal.test(10);
        cal.test("a");
        cal.test(10, "a");
        cal.test("a", 10);
    }
}

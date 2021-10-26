package com.thevarungupta.Day4;

interface ISayHello{
    String hello();
}

interface ISayHello2{
    String hello(String name);
}

interface ICalculator{
    int addNumber(int a, int b);
}

public class Demo9 {
    public static void main(String[] args) {
//        ISayHello s = () -> {
//            return "Hello World";
//        };
//        String result = s.hello();
        //System.out.println(s.hello());

//        ISayHello2 s = (a) -> {
//            return "Hello "+ a;
//        };
//        System.out.println(s.hello("Mark"));

        ICalculator calculator = (x, y) -> {

            return x + y;
        };
        System.out.println("Sum: "+ calculator.addNumber(100, 200));


    }
}

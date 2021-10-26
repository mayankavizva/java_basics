package com.thevarungupta.Day4;

interface DrawSomething{
    void draw();
}

class Output implements DrawSomething{

    @Override
    public void draw() {
        System.out.println("drawing..");
    }
}

public class Demo8 {
    public static void main(String[] args) {
        // without lambda expression
//        Output out = new Output();
//        out.draw();
//        DrawSomething d = new DrawSomething() {
//            @Override
//            public void draw() {
//                System.out.println("drawing...");
//            }
//        };
//        d.draw();

        // lambda expression
        DrawSomething d = () -> {
            System.out.println("drawing222...");
        };
        d.draw();


    }
}

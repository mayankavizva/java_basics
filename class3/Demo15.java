package com.thevarungupta.Day3;

interface Drawable{


    void draw();

     default void print(){
        System.out.println();
    }
}

class Rect implements Drawable{


    @Override
    public void draw() {
        System.out.println("drawing...");
    }
}

public class Demo15 {
    public static void main(String[] args) {
        Rect obj = new Rect();
        obj.draw();
        obj.print();
    }
}

package com.thevarungupta.Day3;

interface  Drawable2{
    void draw();
    static void area(){

        System.out.println("getting area");
    }

    private void something(){

    }

    private void something2(){
        something();
    }
}

class Circle2 implements Drawable2{

    @Override
    public void draw() {

    }
}

public class Demo16 {
    public static void main(String[] args) {
        Drawable2.area();
    }
}

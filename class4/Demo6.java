package com.thevarungupta.Day4;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape{

    @Override
    void draw() {

    }
}

class Cone{
    void draw(){
        System.out.println("drawing cone...");
    }
}

class Test2{
    // creating a method that accepts only child class of shape class
    public static void drawShape(List<? extends Shape> list){
        for(Shape shape: list){
            shape.draw();  // calling method of shape class by child class instance
        }
    }


}


public class Demo6 {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();


        Test2.drawShape(rectangleList);
        Test2.drawShape(circleList);
        //Test2.drawShape(coneList);
    }
}

package com.thevarungupta.Day3;

//interface I1{
//    void print();
//}
//
//interface I2{
//    void display();
//}
//
//class Output2 implements I1, I2{
//
//    @Override
//    public void print() {
//
//    }
//
//    @Override
//    public void display() {
//
//    }
//}

interface I1{
    void print();
}

interface I2 extends I1{
    void display();
}

class Output2 implements I2{

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }
}

public class Demo14 {
    public static void main(String[] args) {

    }
}

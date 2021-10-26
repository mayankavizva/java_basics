package com.thevarungupta.Day3;

abstract class Test10 {
    public abstract void display1();
}

abstract class Test11 extends Test10 {
    public abstract void display2();
}

abstract class Test12 extends Test11 {
    public abstract void display3();
}
class Output extends Test12{

    @Override
    public void display1() {

    }

    @Override
    public void display2() {

    }

    @Override
    public void display3() {

    }
}


public class Demo11 {
    public static void main(String[] args) {

    }
}

package com.thevarungupta.Day3;

abstract class Calculation {
    // non abstract methods
    public void addNumber(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void subNumber(int num1, int num2) {
        System.out.println("Sub: " + (num1 - num2));
    }

    // abstract method
    public abstract void mulNumber(int num1, int num2);
    public abstract void divNumber(int num1, int num2);

}

class Test extends Calculation{

    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Mul: "+ (num1 * num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Div: "+ (num1 / num2));
    }
}


public class Demo8 {
    public static void main(String[] args) {
        Test test = new Test();
        test.addNumber(100, 50);
        test.subNumber(100, 50);
        test.mulNumber(100, 50);
        test.divNumber(100, 50);
    }
}

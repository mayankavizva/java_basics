package com.thevarungupta.Day5;

class EmployeeException extends RuntimeException{

}

public class Demo3 {
    public static void main(String[] args) {
        //throw new ArithmeticException();
        throw new EmployeeException();
    }
}

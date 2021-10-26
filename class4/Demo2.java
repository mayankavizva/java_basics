package com.thevarungupta.Day4;

import java.util.Objects;

class Calculator<T>{
    public boolean areEqual(T num1, T num2){
        if(num1.equals(num2))
            return true;
        else
            return false;
    }
}

public class Demo2 {
    public static void main(String[] args) {
//        Calculator<> calculator = new Calculator();
//        boolean result = calculator.areEqual()

        //Calculator<String> calculator = new Calculator<>();
        //boolean result =  calculator.areEqual("A", "A");

        Calculator<Integer> calculator = new Calculator<>();
        boolean result = calculator.areEqual(10, 10);

        if(result){
            System.out.println("Are Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}

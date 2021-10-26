package com.thevarungupta.Day5;

public class Demo2 {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int c  =0;
        try{
            c = a / b;
        }


        catch (ArithmeticException ex) {
            System.out.println("b cannot be zero");
        }

        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(c);


    }
}

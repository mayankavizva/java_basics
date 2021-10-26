package com.thevarungupta.Day4;

interface IDisplay{
    String message(String str);
}

public class Demo11 {
    public static void main(String[] args) {
        IDisplay iDisplay = (m) ->{
            String str1 = "Hello ";
            String str2 = m;
            String str3 = ", How are you";
            return str1 + str2 + str3;
        };
        System.out.println(iDisplay.message("Mark"));
    }
}

package com.thevarungupta.Day4;

import java.util.ArrayList;
import java.util.List;

public class Demo10 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Mark");
        list.add("Paul");
        list.add("Watson");
        list.add("Stacy");

        list.forEach(
                (name) -> System.out.println(name)
        );


    }
}

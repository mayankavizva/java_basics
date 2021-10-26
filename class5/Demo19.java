package com.thevarungupta.Day5;

import java.io.File;

public class Demo19 {
    public static void main(String[] args) {
        File file = new File("db", "first.txt");
        file.delete();

        System.out.println(file.exists());
    }
}

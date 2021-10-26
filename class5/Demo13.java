package com.thevarungupta.Day5;

import java.io.FileOutputStream;

public class Demo13 {
    public static void main(String[] args) {

        // try with resources
        try(FileOutputStream stream = new FileOutputStream("D://")){

        }
        catch (Exception ex){

        }

    }
}

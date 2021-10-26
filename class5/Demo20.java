package com.thevarungupta.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo20 {
    public static void main(String[] args) throws IOException {
        // it will first check dp we have file by this name
        // or it will create a new file
        FileWriter fw = new FileWriter("data2.txt", true);
        fw.write(10);
        fw.write(100);  // single character
        fw.write("this is some 2222222222222");
        fw.write("\n");
        char[] c1 = {'a', 'b', 'c'};
        fw.write(c1);
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}

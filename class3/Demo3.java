package com.thevarungupta.Day3;

class Bike{
    public final int speedLimit = 60;
    public void drive(){
        //speedLimit = 80;
        System.out.println("bike is running at the speed of "+ speedLimit);
    }

}

public class Demo3 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        //bike.speedLimit = 80;
        bike.drive();
    }
}

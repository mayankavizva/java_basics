package com.thevarungupta.Day2;

class Car{
    public int model;
    public String year;
    public String brand;
    public String carName;
    public String color;
    public int price;

    public Car(int model, String year, String brand, String carName, String color, int price){
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.carName = carName;
        this.color = color;
        this.price = price;
    }

    public Car(Car obj){
        this.model = obj.model;
        this.year = obj.year;
        this.brand = obj.brand;
        this.carName = obj.carName;
        this.color = obj.color;
        this.price = obj.price;
    }

    public Car(Car obj, int price){
        this.model = obj.model;
        this.year = obj.year;
        this.brand = obj.brand;
        this.carName = obj.carName;
        this.color = obj.color;
        this.price = price;
    }


}

public class Demo4 {
    public static void main(String[] args) {
        Car car1 = new Car(1, "2021", "Audi", "A6", "Black", 20000);
        Car car2 = new Car(car1);
        Car car3 = new Car(car1, 30000);
    }
}

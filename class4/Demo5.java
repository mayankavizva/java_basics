package com.thevarungupta.Day4;

class Employee{

    String name;

    public <T> Employee(T name){
        this.name = name.toString();
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mark");
        Employee emp2 = new Employee(123);
    }
}

package com.thevarungupta.Day3;

interface IEmployee{
    void display();
    void print();
}

class Employee implements IEmployee{

    @Override
    public void display() {
        System.out.println("interface display method");
    }

    @Override
    public void print() {
        System.out.println("interface print method");
    }
}


public class Demo12 {
    public static void main(String[] args) {
        //IEmployee iEmployee = new IEmployee()
        Employee employee = new Employee();
        employee.print();
        employee.display();
    }
}

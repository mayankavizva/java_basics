package com.thevarungupta.Day2;

class Employee{
    public int empId;
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    //private String ATM_PIN;

    public void getFullName(){
        System.out.println(firstName+ " "+ lastName);
    }
}

class FullTimeEmployee extends Employee{
    public int annualSalary;
}

class PartTimeEmployee extends Employee{
    public int hourSalary;
}



public class Demo5 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.firstName = "Mark";
        fte.lastName = "Smith";


        PartTimeEmployee pte = new PartTimeEmployee();
        pte.firstName = "Paul";
        pte.lastName = "Watson";

        fte.getFullName();
        pte.getFullName();
    }
}

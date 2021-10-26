package com.thevarungupta.Day4;

class GenericDemo<T>{
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    T get(){
        return obj;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        GenericDemo<Integer> genericDemo = new GenericDemo<>();
        genericDemo.obj = 10;
        genericDemo.add(20);
        System.out.println(genericDemo.get());
    }
}

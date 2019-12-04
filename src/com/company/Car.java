package com.company;

public class Car extends Vehicle {
    public Car() {
    }

    @Override
    void start() {
       // super.start();
        System.out.println("Car startuje");
    }

    void jedzie(){
        System.out.println("Car jedzie");
    }
}

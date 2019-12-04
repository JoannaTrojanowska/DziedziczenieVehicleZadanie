package com.company;

public class Truck extends Car {
    public Truck() {
    }

    @Override
    void start() {
       // super.start();
        System.out.println("Truck startuje");
    }

    @Override
    void jedzie() {
       // super.jedzie();
        System.out.println("Truck jedzie");
    }
    void trucktrabi(){
        System.out.println("Truck trabi");
    }
}

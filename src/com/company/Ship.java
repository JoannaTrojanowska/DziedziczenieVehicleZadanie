package com.company;

public class Ship extends Vehicle {
    public Ship() {
    }

    @Override
    void start() {
        //super.start();
        System.out.println("Ship startuje");
    }

    void plynie(){
        System.out.println("Ship plynie");
    }
}

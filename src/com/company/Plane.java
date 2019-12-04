package com.company;

public class Plane extends Vehicle {
    public Plane() {
    }

    @Override
    void start() {
      //  super.start();
        System.out.println("Plane startuje");
    }

    void fly(){
        System.out.println("Plane leci");
    }
}

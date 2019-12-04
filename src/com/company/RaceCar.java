package com.company;

public class RaceCar extends Car {
    public RaceCar() {
    }

    @Override
    void start() {
        //super.start();
        System.out.println("RaceCar startuje");
    }

    @Override
    void jedzie() {
        super.jedzie();
    }

    void racecarwygral(){
        System.out.println("RaceCar wygral wyscig");
    }
}

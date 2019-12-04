package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {new Vehicle(), new Plane(), new Car(), new Ship(), new Truck(), new RaceCar()};


        for (Vehicle ve : vehicles) {
            if (ve instanceof Truck) {
                Truck t = ((Truck) ve);
                t.jedzie();
                t.start();
                t.trucktrabi();
            } else if (ve instanceof RaceCar) {
                RaceCar r = ((RaceCar) ve);
                r.jedzie();
                r.racecarwygral();
                r.start();
            } else if (ve instanceof Car) {
                Car c = ((Car) ve);
                c.jedzie();
                c.start();
            } else if (ve instanceof Plane) {
                Plane p = ((Plane) ve);
                p.fly();
                p.start();
            } else if (ve instanceof Ship) {
                Ship s = ((Ship) ve);
                s.plynie();
                s.start();
            } else if (ve instanceof Vehicle) {
                ve.start();
            }
        }
    }


}


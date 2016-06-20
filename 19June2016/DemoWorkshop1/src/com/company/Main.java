package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Vehicle vv[] = new Vehicle[3];
//        Vehicle v = new Vehicle("Red", 2016, "Toyota");
        Car c = new Car("White", 2015, "Honda");
        Bus b = new Bus("Multicolor", 1998, "Heno");
        SportsCar sc = new SportsCar("Black", 2012, "Ferrari");
        Workshop w = new Workshop("Saylani Workshop");
        Random random = new Random();

//        vv[0] = v;
        vv[0] = c;
        vv[1] = b;
        vv[2] = sc;


//
//        Car cc[] = new Car[5];
//        cc[0] = new Car("Red",1998,"Toyota");
//        cc[0].repair();
        int r = random.nextInt(4);
        w.doRepair(vv[r]);

    }
}

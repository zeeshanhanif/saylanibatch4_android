package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle v = new Vehicle("Red",2016,"Toyota");
        Car c = new Car("White",2015,"Honda");
        Bus b = new Bus("Multicolor",1998,"Heno");
        SportsCar sc = new SportsCar("Black",2012,"Ferrari");
        Workshop w = new Workshop("Saylani Workshop");

        w.doRepair(sc);



    }
}

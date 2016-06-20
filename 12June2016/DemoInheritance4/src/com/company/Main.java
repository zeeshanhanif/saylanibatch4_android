package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle vv[] = new Vehicle[4];
        Vehicle v = new Vehicle("Red",2016,"Toyota");
        Car c = new Car("White",2015,"Honda");
        Bus b = new Bus("Multicolor",1998,"Heno");
        SportsCar sc = new SportsCar("Black",2012,"Ferrari");
        Workshop w = new Workshop("Saylani Workshop");

        vv[0] = v;
        vv[1] = c;
        vv[2] = b;
        vv[3] = sc;




        Car cc[] = new Car[5];
        cc[0] = new Car("Red",1998,"Toyota");
        cc[0].repair();

        w.doRepair(sc);



    }
}

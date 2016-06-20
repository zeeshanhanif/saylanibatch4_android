package com.company;

/**
 * Created by zeeshanhanif-pc on 6/12/2016.
 */
public class Car extends Vehicle {
    public Car(String color, int model,String brand){
        super(color,model,brand);
    }

    public void repair(){
        System.out.println("Car repaired");
    }
}

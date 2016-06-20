package com.company;

/**
 * Created by zeeshanhanif-pc on 6/12/2016.
 */
public class Bus extends Vehicle {

    public Bus(String color, int model,String brand){
        super(color,model,brand);
    }

    public void repair(){
        System.out.println("Bus repaired");
    }
}

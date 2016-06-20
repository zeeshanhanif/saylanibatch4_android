package com.company;

/**
 * Created by zeeshanhanif-pc on 6/12/2016.
 */
public class SportsCar extends Car {
    public SportsCar(String color, int model,String brand){
        super(color,model,brand);
    }

    public void repair(){
        System.out.println("SportsCar repaired");
    }
}

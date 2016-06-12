package com.company;

/**
 * Created by zeeshanhanif-pc on 6/12/2016.
 */
public class Vehicle {

    private String color;
    private int model;
    private int engineNo;
    private String brand;

    public Vehicle(String color, int model,String brand){
        this.color = color;
        this.model = model;
        this.brand = brand;
    }


    public void repair(){
        System.out.println("Vehicle Repaired");
    }


}

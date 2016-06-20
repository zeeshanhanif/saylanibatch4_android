package com.company;

/**
 * Created by zeeshanhanif-pc on 6/12/2016.
 */
public class Workshop {

    private String name;

    public Workshop(String name){
        this.name= name;
    }
    public void doRepair(Vehicle v){
            v.repair();
    }


}

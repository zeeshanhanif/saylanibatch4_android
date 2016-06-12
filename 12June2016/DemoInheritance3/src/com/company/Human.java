package com.company;

/**
 * Created by zeeshanhanif-pc on 6/12/2016.
 */
public class Human{
    public String name;
    public int age;
    public String gender;


    public Human(String name,int age, String gender){
        System.out.println("Human three argument");
        this.name=name;
        this.age = age;
        this.gender = gender;
    }


    public void sleep(){
        System.out.println("Human is sleeping");
    }

    public void eat(){
        System.out.println("Human is eating");
    }

}

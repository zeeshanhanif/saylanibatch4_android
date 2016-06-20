package com.company;

/**
 * Created by zeeshanhanif-pc on 6/19/2016.
 */
public class Student extends Human implements Pakistani{
    @Override
    public void eat() {
        System.out.println("Student Eat()");

    }

    @Override
    public void sleep() {
        System.out.println("Student Sleep()");

    }

    @Override
    public void lookingForFood() {
        System.out.println("Looking for Desi Food");
    }
}

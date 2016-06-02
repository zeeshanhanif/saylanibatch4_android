package com.company;

/**
 * Created by zeeshanhanif-pc on 5/29/2016.
 */
public class Student {
    int age;
    int rollNum;
    String name;

    public Student() {
        age = 10;
        rollNum = 10;
        name = "Default";
    }

    public Student(int age, int rollNum) {
        this.age = age;
        this.rollNum = rollNum;
        name = "Default";
    }

    public Student(String name) {
        this.name = name;
        age = 0;
        rollNum = 1;
    }

    public Student(int rollNum) {
        this.name = "Default";
        age = 0;
        this.rollNum = rollNum;
    }

    public void displayStudent() {
        System.out.println("Name : " + name
                + " Age : " + age
                + " Roll# " + rollNum);
    }
}

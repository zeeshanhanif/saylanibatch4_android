package com.company;

/**
 * Created by zeeshanhanif-pc on 5/29/2016.
 */
public class Student {
    public String name;
    private int age;
    protected String email;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 80 ){
            this.age = age;
        }
    }
}

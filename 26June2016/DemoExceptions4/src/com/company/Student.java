package com.company;

/**
 * Created by zeeshanhanif-pc on 6/26/2016.
 */
public class Student {

    private String name;
    private int age;
    public Student(String name, int age)throws Exception{
        this.name = name;
        if(age > 80){
            throw new Exception("Age can not be greater then 80");
            //System.out.println("Age can not be greater then 80");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.company;

/**
 * Created by zeeshanhanif-pc on 6/12/2016.
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("Student Empty constructor");
    }

    public Student(String name){
        this();
        this.name = name;
        System.out.println("Student one argument constructor");
    }
    public Student(String name,int age){
        this(name);
        this.age = age;
        System.out.println("Student two argument constructor");
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

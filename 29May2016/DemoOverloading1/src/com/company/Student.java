package com.company;

/**
 * Created by zeeshanhanif-pc on 5/29/2016.
 */
public class Student {
    int age;
    int rollNum;
    String name;
    public void addStudent(){
        System.out.println("Add Student Empty");
    }
    public void addStudent(Student s){
        System.out.println("Add Student by Object");

    }
    public void addStudent(String name,int age, int rollNum){
        System.out.println("Add Student through attributes");

    }

}

package com.company;

/**
 * Created by zeeshanhanif-pc on 5/22/2016.
 */
public class Student {
    int age;
    int rollNum;
    String name;
    static String course;

    public void displayName(){
        System.out.println("Hello :"+name);
        System.out.println(course);
    }

    public static void displayCourse(){
        System.out.println(course);
//        System.out.println("Hello :"+name);

    }
}

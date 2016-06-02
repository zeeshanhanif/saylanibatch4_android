package com.company;

import demo.Teacher;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student();
        s.name = "Hello";
        s.email = "abc@gmail.com";
        //s.age = 400;
        System.out.println("Name = "+s.name);
        //System.out.println("Age = "+s.age);
        Teacher t = new Teacher();
        t.name = "abc";


    }
}

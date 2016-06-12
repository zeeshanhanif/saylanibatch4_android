package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human("Hello",45,"M");
        h.sleep();
        h.eat();
        System.out.println("++++++++++++++++++");
        Student s = new Student("world",12,"F");
        s.sleep();
        s.eat();

        System.out.println("++++++++++++++++++");
        Human h1 = new Student("abc",22,"M");
        h1.sleep();
        h1.eat();


    }
}

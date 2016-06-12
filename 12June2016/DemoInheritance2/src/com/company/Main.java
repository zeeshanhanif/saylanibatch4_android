package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human("Hello",45,"M");
        System.out.println(h.name);
        System.out.println(h.age);
        System.out.println(h.gender);
        h.sleep();
        h.eat();
        System.out.println("++++++++++++++++++");
        Student s = new Student("world",12,"F");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.gender);
        s.sleep();
        s.eat();

        System.out.println("++++++++++++++++++");
        System.out.println(h.name);
        System.out.println(h.age);
        System.out.println(h.gender);

    }
}

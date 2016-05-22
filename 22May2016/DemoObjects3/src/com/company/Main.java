package com.company;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Saylani");
        String name = s1.displayName();
        System.out.println(name);
        int maximum = s1.max(10,15);
//        int maximum2 = s1.max(true,15);
        System.out.println(maximum);
    }
}

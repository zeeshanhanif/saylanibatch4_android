package com.company;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s4 = new Student();
        System.out.println(s.age);
        s.age = 21;
        System.out.println(s.age);
        s1.age = 25;
        System.out.println(s1.age);

        Student s3 = s1;
        System.out.println(s3.age);
        s3.age = 30;
        System.out.println("s3 " + s3.age);
        System.out.println("s1 " + s1.age);
        s4 = s1;
        System.out.println("s1 " + s1.age);


    }
}

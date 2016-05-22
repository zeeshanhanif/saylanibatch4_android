package com.company;

public class Main {

    public static void main(String[] args) {
        Student.course = "Batch-4";
        System.out.println(Student.course);
        Student.displayCourse();
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Amir";
        s2.name = "Aziz";
        String c = s1.course;
        s1.displayName();
        s2.displayName();
        System.out.println();
        Student.course = "Batch-5";
        s1.displayName();
        s2.displayName();
    }
}

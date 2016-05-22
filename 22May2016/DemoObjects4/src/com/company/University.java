package com.company;

import java.util.ArrayList;

/**
 * Created by zeeshanhanif-pc on 5/22/2016.
 */
public class University {
    String name;
    Student s;
    int index = 0;
    Student[] students = new Student[5];

    public void addStudent() {
        s = new Student();
    }

    public void addStudent1(Student s) {
        this.s = s;
    }

    public void addStudent2(String name, int age, int rollNum) {
        s = new Student();
        s.age = age;
        s.name = name;
        s.rolNum = rollNum;
    }
    public void addStudent3(Student s){
        students[index++] = s;
    }
    public void displayStudentList(){
        for(int i =0;i<this.index;i++){

            System.out.println(this.students[i].name);

        }
    }
    public Student[] getStudentList(){
        return students;
    }


}

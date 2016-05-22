package com.company;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Amir";
        student.age = 23;
        student.rolNum = 12;

        University university = new University();
        university.addStudent1(student);
        university.addStudent2("AbdulAziz",21,51);
        System.out.println(university.s.name);
        Student student1 = new Student();
        student1.name = "Asad";
        Student student2 = new Student();
        student2.name = "Ahmed";
        Student student3 = new Student();
        student3.name = "Ali";
        university.addStudent3(student1);
        university.addStudent3(student2);
        university.addStudent3(student3);
        /*for(int i =0;i<university.students.length;i++){
            if (university.students[i] != null) {
                System.out.println(university.students[i].name);
            }
        }*/
//        for(int i =0;i<university.index;i++){
//
//                System.out.println(university.students[i].name);
//
//        }
        university.displayStudentList();
        Student[] myStudents = university.getStudentList();
        university.students[0].name = "Hello World";
        System.out.println(university.students[0].name);
        System.out.println(myStudents[0].name);
    }
}

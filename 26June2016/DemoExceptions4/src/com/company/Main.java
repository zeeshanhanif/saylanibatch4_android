package com.company;

public class Main {

    public static void main(String[] args){
	// write your code here
        //Student st1 = new Student("Hello", 3);
        //System.out.println(st1.getAge());
        try {
            Student st = new Student("Hello", 56454545);
            System.out.println(st.getAge());
        }
        catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}

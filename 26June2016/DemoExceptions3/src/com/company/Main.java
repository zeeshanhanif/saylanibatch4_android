package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Student st = new Student("Hello", 56454545);
            System.out.println(st.getAge());
        }
        catch (ArithmeticException e){
            System.out.println("Exception "+e);
        }
    }
}

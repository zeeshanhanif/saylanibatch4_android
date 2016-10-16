package com.company;

public class Main {

    public static void main(String[] args){
	// write your code here
        /*Student st1 = new Student("Hello", 3);
        System.out.println(st1.getAge());*/
        try {
            Student st = new Student("Hello", 454545);
            System.out.println(st.getAge());
        }
        catch (AgeIncorrectException e){
            System.out.println("Exception "+e);
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally will always run");
        }
        System.out.println("After");
    }
}

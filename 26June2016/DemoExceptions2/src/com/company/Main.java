package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5;
        int b = 0;

        System.out.println("Before");
        try {
            int c = a / b;
            int abc[] = new int[2];
            System.out.println(c);
            System.out.println(abc[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handle Index out of bound exception");
            System.out.println("Exception "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Handle Arithmetic Exception ");
            System.out.println("Exception "+e);
        }
        catch(Exception e){
            System.out.println("Handle exception");
            System.out.println("Exception "+e);
        }


        System.out.println("After");
    }
}

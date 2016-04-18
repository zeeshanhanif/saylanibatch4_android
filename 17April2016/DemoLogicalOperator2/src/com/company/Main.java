package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 6;
        int b = 8;

        boolean c = a > b;
        boolean d = a == b;

        boolean e = c && d;
        boolean f = (a < b) && (++a == b);
        System.out.println("E = "+e);
        System.out.println("F = "+f);
        System.out.println("A = "+a);


    }
}

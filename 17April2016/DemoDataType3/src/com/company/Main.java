package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 7;
        /*int b = a+1;
        a = b;

        a = a+1;
        a+=1;*/
        System.out.println("A = "+a);
        int b = a++;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        int c = 5;
        int d = c++ + ++c - --c;
        int e = c++ + ++c / --c;
        System.out.println(d);

        int abc = 6;
        int xyz = 5;

        int abc1 = 8/5;
        int abc2 = 16%5;
        System.out.println("Abc1 = "+abc1);
        System.out.println("Abc2 = "+abc2);



    }
}

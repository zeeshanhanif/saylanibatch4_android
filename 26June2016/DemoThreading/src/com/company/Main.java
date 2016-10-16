package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyThread t = new MyThread();
        t.start();
        MyThreadRun tr = new MyThreadRun();

        Thread thr = new Thread(tr);
        thr.start();

        for(int i=0;i<10;i++){
            System.out.println("I = "+i);
        }

    }
}

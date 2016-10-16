package com.company;

/**
 * Created by zeeshanhanif-pc on 6/26/2016.
 */
public class MyThread extends Thread {

    public void run(){
        for (int j=0;j<10;j++){
            System.out.println("J = "+j);
        }
    }
}

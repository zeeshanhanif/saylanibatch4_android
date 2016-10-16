package com.company;

/**
 * Created by zeeshanhanif-pc on 6/26/2016.
 */
public class MyThreadRun implements Runnable {
    public void run(){
        for (int k=0;k<10;k++){
            System.out.println("K = "+k);
        }
    }
}

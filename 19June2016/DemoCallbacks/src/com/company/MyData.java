package com.company;

/**
 * Created by zeeshanhanif-pc on 6/19/2016.
 */
public class MyData {

    public void doSomeWork(){
        System.out.println("Working");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work Done!!");

    }
    public void doSomeWorkAgain(int a,MyClickListener listener){
        System.out.println("Working");
        listener.onClick("Hello World");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Work Done!!");

    }
}

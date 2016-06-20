package com.company;

public class Main {

    public static void main(String[] args) {
        MyData myData = new MyData();
//        myData.doSomeWork();
        MyClickListener listener = new MyListenerImplementation();
        MyClickListener listener2 = new MyClickListener() {
            @Override
            public void onClick(String msg) {
                System.out.println("Hello World 2 = " + msg);
            }
        };

        myData.doSomeWorkAgain(4,listener);

        myData.doSomeWorkAgain(3,listener2);
        int a = 5;
        myData.doSomeWorkAgain(a,new MyClickListener() {
            @Override
            public void onClick(String msg) {
//              a = 10;
                System.out.println("Hello World"+a+ msg);
            }
        });

        System.out.println("After DSW");
        MyClass myClass = new MyClass();
        myClass.doCalculation("HEllO");
        MyClass myClass1 = new MyClass(){
            @Override
            public void doCalculation(String s) {
                System.out.println("Again Calculate "+s);
            }
        };

        myClass1.doCalculation("World");
    }
}

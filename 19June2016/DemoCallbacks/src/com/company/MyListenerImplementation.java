package com.company;

/**
 * Created by zeeshanhanif-pc on 6/19/2016.
 */
public class MyListenerImplementation implements MyClickListener {
    @Override
    public void onClick(String msg) {
        System.out.println(msg);
    }
}

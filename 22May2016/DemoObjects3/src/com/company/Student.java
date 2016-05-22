package com.company;

/**
 * Created by zeeshanhanif-pc on 5/22/2016.
 */
public class Student {
    int age;
    int rollNum;
    String name;
    public String displayName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int max(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
//        return 0;
    }
}

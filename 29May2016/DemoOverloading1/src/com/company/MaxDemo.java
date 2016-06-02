package com.company;

/**
 * Created by zeeshanhanif-pc on 5/29/2016.
 */

    public class MaxDemo {
    public int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public int max(int a, int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>c && b>a){
            return b;
        }
        return c;
    }
    public int max(String a, String b){
        if (a.length()>b.length()){
            return a.length();
        }
        return b.length();
    }
    public float max (float a,float b){
        if (a>b){
            return a;
        }
        return b;
    }
}

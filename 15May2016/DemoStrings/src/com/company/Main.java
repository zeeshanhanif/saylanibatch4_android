package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "XYZ";
        String str1 = new String("ABC");
        String str2 = new String(str1);
        char[] char1 = {'a','b'};
        String str3 = new String(char1);
        System.out.println("Str : "+str);
        System.out.println("Str1 : "+str1);
        System.out.println("Str2 : "+str2);
        System.out.println("Str3 : "+str3);
    }
}

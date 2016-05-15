package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "XYZ";
        String str1 = new String("XYZ");
        String str2 = "XYZ";
        str2 = "hello";
        String str3 = new String(str1);
        System.out.println("Str : "+str);
        System.out.println("Str1 : "+str1);
        System.out.println("Str2 : "+(str1==str3));
        System.out.println("Str2 : "+(str1.equals(str3)));

        System.out.println("Str1 : "+(str1==str));

    }
}

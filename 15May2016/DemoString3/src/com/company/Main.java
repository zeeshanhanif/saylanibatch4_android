package com.company;

public class Main {

    public static void main(String[] args) {
        String str1 = "abc,def,jhi,klm,ncv";
        String str2 = "abc";
        //Equality Check
        System.out.println(str1.equals(str2));
        //Ignore Case
        System.out.println(str1.equalsIgnoreCase(str2));

        //Find Character at Given Index
        System.out.println(str1.charAt(2));

        //Find Index of the Character
        System.out.println(str1.indexOf('C'));
        System.out.println(str1.indexOf('C',10));
        System.out.println(str1.indexOf("AB"));
        System.out.println(str1.lastIndexOf('C'));

        //Substring
        String a = str1.substring(0,4);
        System.out.println(a);

        //Array Of Characters
        char[] text = str1.toCharArray();
        for(char c : text){
//            System.out.println(c);
        }
        //Break into Array
        String[] textArray = str1.split(",");
        for (String s : textArray) {
            System.out.println(s);
        }
    }
}

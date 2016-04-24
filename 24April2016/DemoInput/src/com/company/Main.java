package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter any key");
        try {
            char a = (char)System.in.read();
            System.out.println("Your input = "+a);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

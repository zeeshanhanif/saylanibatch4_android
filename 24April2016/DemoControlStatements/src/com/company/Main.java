package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int marks = 75;
        if(marks >80){
            System.out.println("A");
        }
        else if(marks > 70 && marks <= 80){
            int abc = 45;
            System.out.println("B");
            if(marks == 75 && abc > 40 ){
                System.out.println("75 and > 40");
            }
        }
        else if(marks > 60 && marks <= 70){
            System.out.println("C");
        }
        else if(marks > 50 && marks <= 60){
            System.out.println("D");
        }
        else {
            System.out.println("Failed");
        }



    }
}

package com.company;

public class Main {

    public static void main(String[] args)throws Exception {
	// write your code here
        System.out.println("Please enter any character");

        char v = (char)System.in.read();
        switch (v){
            case 'A':{
                System.out.println("Found A");
                break;
            }
            case 'E':
                System.out.println("Found E");
            case 'I':
                System.out.println("Found I");
                break;
            case 'O':
                System.out.println("Found O");
                break;
            case 'U':
                System.out.println("Found U");
                break;
            default:
                System.out.println("Not Found");
                break;

        }
    }
}

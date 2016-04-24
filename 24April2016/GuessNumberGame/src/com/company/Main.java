package com.company;

public class Main {

    public static void main(String[] args)throws Exception {
	// write your code here
        char number = 'A';
        boolean doContinue = false;
        do {
            doContinue = false;
            System.out.println("Please enter character between A to Z");
            char userInput = (char) System.in.read();
            System.in.read();
            if (number == userInput) {
                System.out.println("Congratulations you win!!!");
            } else {
                System.out.println("Sorry, you lose");
                System.out.println("Do you want to try again");
                System.out.println("Press Y/y for Yes or any key to end game");
                char continueChar = (char)System.in.read();
                System.in.read();
                if(continueChar == 'Y' || continueChar == 'y'){
                    doContinue = true;
                }
            }

        }while(doContinue);
    }
}

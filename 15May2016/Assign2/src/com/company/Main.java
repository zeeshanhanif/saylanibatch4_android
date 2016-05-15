package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Maximum number for prime numbers");
        int maxInput = input.nextInt();

        System.out.println("Please enter number of prime numbers");
        int primeInput = input.nextInt();

        int[] primeArray = new  int[primeInput];

        if(maxInput<=primeInput){
            System.out.println("Max number should be greater than number of prime");
            return;
        }
        int foundElement = 0;
        boolean flag = true;
        for(int i=3; i<maxInput && flag ;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && (flag=(foundElement<primeArray.length)) )
            {
                primeArray[foundElement++]= i;
                System.out.println("Prime Number:"+i);
            }




        }
        for(int j = 0 ;j<primeArray.length;j++){
            System.out.println("Prime Numbers are : "+primeArray[j]);
        }
    }
}

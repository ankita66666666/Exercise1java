package com.stackroute;

import java.util.Scanner;

class CheckEvenOdd {
    public static void main(String args[]) {
        int num;
        System.out.println("Enter an com.stackroute.Integer number:");

        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        if (num % 2 == 0 && ((num <= 20) && (num >= 30))) {

            System.out.println("Entered number is even" + "Tom");
        } else {
            System.out.println("Entered number is odd" + "Jerry");
        }
    }
}

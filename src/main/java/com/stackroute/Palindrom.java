package com.stackroute;

import java.util.*;

class Palindrom {
    public static void main(String args[]) {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered number is a palindrome.");
            int n = Integer.parseInt(original);
            int sum = 0;
            int tempnumber = 0;
            while (n != 0) {
                tempnumber = n % 10;
                if (tempnumber % 2 == 0) {
                    sum += tempnumber;

                }
                n = n / 10;

            }
            System.out.println((sum >= 25)? "Sum of even numbers is greater than 25" : "sum of even numbers is less than 25");
        }
        else
            System.out.println("Entered number isn't a palindrome.");

    }
}







package com.stackroute;

import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String args[]) {
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] inputArray = input.toCharArray();
        for (char ch : inputArray) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                System.out.println("Given character is an vowel");
            } else {
                System.out.println("Given character is a consonant");
            }
        }

    }
}
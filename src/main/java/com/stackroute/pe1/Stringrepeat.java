package com.stackroute.pe1;

import java.util.Scanner;

public class Stringrepeat {
    public String repeat(String input, int number) {
        StringBuilder output = new StringBuilder(input);
        /*Take number from user*/
        System.out.print("Enter number: ");

        String subString = output.substring(input.length() - number);
        for (int i = 0; i < number; i++) {
            output.append(subString);
        }
        return (output.toString());
    }
}


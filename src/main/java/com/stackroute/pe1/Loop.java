package com.stackroute.pe1;

import java.util.Scanner;

public class Loop {
    public String repeat(int number) {
        StringBuilder output = new StringBuilder();
        /*Take number from user*/

        for (int i = 1; i < number+1; i++) {
            for (int j = 0; j < i ; j++) {
                output.append(i);
            }
        }

        {
            return (output.toString());
        }
    }
}







 package com.stackroute.pe1;

public class Vowelconsonant {
    public String checkCharacter(String input) {
        if ((input != null) && (!input.isEmpty()) && (!input.matches(".*\\d.*"))) {
            char[] inputArray = input.toCharArray();
            for (char c : inputArray) {
                if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
                    return (c + " - Vowel");
                } else {
                    System.out.println(c + " - Consonant");
                }
            }
        } else {
            return ("Please give a valid string");
        }
        return input;
    }
}

package com.stackroute.pe1;

public class JunitDemo {

    public String concatAndUpperCase(String str1, String str2){

        if(str1==null || str2==null)
        {
            return ("Null Value Not Allowed");
        }
        String concatedString = str1.concat(str2);
        return concatedString.toUpperCase();
    }

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        return reversedString;
    }



}
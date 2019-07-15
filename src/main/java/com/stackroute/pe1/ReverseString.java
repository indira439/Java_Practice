package com.stackroute.pe1;


public class ReverseString {

    public String reverseStringChecker(String str) {
        String string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            string = string + str.charAt(i);
        }
        return string;
    }
}



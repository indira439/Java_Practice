package com.stackroute.pe1;

/**
 * Practice Exercise Question - 9
 * A program to reverse any string without using String Buffer.
 */
public class ReverseString {

    public String reverseStringChecker(String str) {
        String reverseString = "";

        /**Loop through for arrayLength iterations*/
        for (int i = str.length() - 1; i >= 0; i--) {
            /**Store the element in inputArray in reverseArray from back.*/
            reverseString = reverseString + str.charAt(i);
        }

        return reverseString;
    }
}



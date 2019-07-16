package com.stackroute.pe1;

/**
 * Practice Exercise Question - 10
 * Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
 * repeat n number of times in the output String.
 */
public class LastRepeat {

    public String repeatTheLastString(String string, int number) {
        for (int i = 0; i < string.length() - number; i++) {
            return (string);
        }
        for (int i = 0; i < number + 1; i++) {
            for (int j = string.length() - number; j < string.length(); j++) {
                System.out.print(string.charAt(j));
            }
        }
        return  null;
    }
}


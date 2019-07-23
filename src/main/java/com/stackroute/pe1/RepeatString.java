package com.stackroute.pe1;

/**
 * Practice Exercise Question - 10
 * Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
 * repeat n number of times in the output String.
 */
public class RepeatString {

    public String lastRepeat(String string, int number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length() - number; i++) {
            stringBuilder.append(string.charAt(i));
        }
        for (int i = 0; i < number + 1; i++) {
            for (int j = string.length() - number; j < string.length(); j++) {
                stringBuilder.append(string.charAt(j));
            }
        }
        return stringBuilder.toString();
    }
}


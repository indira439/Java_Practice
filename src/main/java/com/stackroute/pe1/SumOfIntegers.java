package com.stackroute.pe1;
/**
 * Practice Exercise Question - 5
 * Class reads an unspecified number of integer arguments using Scanner Class
 * and adds them together.
 */
public class SumOfIntegers {

    public String sumOfIntegers(String inputString) {

        String[] string = inputString.split(" ");
        boolean output = true;
        int sum = 0;

        for (String str : string) {
            for (int i = 0; i < str.length(); i++) {
                if ((!(Character.isDigit(str.charAt(i)))) &&
                        (str.charAt(i) != '-') &&
                        (str.charAt(i) != '+')) {
                    output = false;
                }

            }
        }

        if (output) {
            for (String str : string) {
                sum += Integer.parseInt(str);
            }
            return String.valueOf(sum);
        } else {
            return "Non Integer Value";
        }
    }


}


package com.stackroute.pe1;

/**
 * Practice Exercise Question - 2
 * Class accepts an integer number as input from the user and perform the
 * following conditional checks:
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
public class TomJerry {

    public String tomOrJerryFinder(int inputNum) {
        String returnString = "Not in between 20 and 30";
        if (isBetween20And30(inputNum)){
            if (inputNum % 2 == 0){
                returnString = "Jerry";
            }
            else {
                returnString = "Tom";
            }
        }
        return returnString;
    }

    private static boolean isBetween20And30(int num){
        boolean boo = false;
        if ( (num >= 20) && (num <= 30) ){
            boo = true;
        }
        return boo;
    }
}


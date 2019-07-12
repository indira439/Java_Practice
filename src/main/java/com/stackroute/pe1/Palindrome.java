package com.stackroute.pe1;

import java.util.Scanner;
import java.lang.*;

public class Palindrome  {
    public String palindromeSum(long inputNum){
        String returnResult = "Not a palindrome";
            if ( (isSumOfEvenNum(inputNum) > 25) ) {
                returnResult = "Palindrome and greater than 25";
            }
            else {
                returnResult = "Palindrome and smaller than 25";
            }
        }
    }



    private int isSumOfEvenNum(long number){
        int sumOfEvenNum = 0;
        long localNumber = number;
        while (localNumber > 0){
            if ( (localNumber % 10) % 2 == 0 ){
                sumOfEvenNum += localNumber % 10;
            }
            localNumber = localNumber / 10;
        }
        return sumOfEvenNum;
    }
}
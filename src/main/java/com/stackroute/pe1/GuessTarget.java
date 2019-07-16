package com.stackroute.pe1;

import java.util.Random;

/**
 * Practice Exercise Question - 8
 * Class accepts a number from user as input (set the limit say 1 - 50 or 1 -
 * 100) User should guess until the the target number is guessed correctly.
 */
public class GuessTarget {

    public String guessTargetNumber(int guessNum){
        /**Create a random variable*/
        Random random = new Random();

        /**Pick a random number within the "min" and "max" limit*/
        int target = random.nextInt(100);

        /**Loop for checking whether guessed number matches target or not*/
            while (target != guessNum) {
                if (guessNum > target) {
                    return ("Guessed number is greater than target");
                } else {
                    return ("Guessed number is lesser than target");
                }
            }
         /**Guessed number is equals to target*/
            return ("You Guessed Correct");

        }
    }





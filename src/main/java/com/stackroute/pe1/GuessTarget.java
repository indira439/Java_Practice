package com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;

public class GuessTarget {


        public static void main(String[] args) {
            Random rand=new Random();
            int target = rand.nextInt(100);
            int guess=0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Guess the number Between 1 to 100");
            guess = sc.nextInt();


            System.out.println("Generated random number "+target);


            while (target != guess) {
                if (guess > target) {
                    System.out.println("Guessed number is greater than target");
                    break;
                } else {
                    System.out.println("Guessed number is lesser than target");
                    break;
                }
            }
            System.out.println("You Guessed Correct");

        }
    }




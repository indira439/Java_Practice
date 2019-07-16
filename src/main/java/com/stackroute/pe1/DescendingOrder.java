package com.stackroute.pe1;

import java.util.ArrayList;
import java.util.*;

/**
 * Practice Exercise Question - 7
 * Class accepts a number as input from user and perform the following:
 * a. sort the number in non-increasing order
 * b. after sorting sum all the even numbers, the sum should be greater than 15 .
 * c. if sum is more than 15,then print output as true or false.
 */
public class DescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        //read the input number from user
        int input_number = scanner.nextInt();

        //initialize sum to 0
        int sum = 0;

        //loop for adding the integers
        for (int i = 0; input_number > 0; i++) {

            int buffer = input_number % 10;
            if (buffer % 2 == 0) {
                sum = sum + buffer;
            }
            digits.add(buffer);
            input_number = input_number / 10;
        }
        //sort the digits in ascending order
        Collections.sort(digits);
        //reverse the digits in descending order
        Collections.reverse(digits);
        System.out.println(digits);
        System.out.println(sum);
        if (sum > 15) {
            //return true if sum is greater than 15
            System.out.println("True");
        } else {
            //return false if sum is less than 15
            System.out.println("False");
        }

    }
}


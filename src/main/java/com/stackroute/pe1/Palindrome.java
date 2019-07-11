package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        int input;
        int rem=0;
        int temp = 0;
        int sum = 0;
        int evensum = 0;

        Scanner number = new Scanner(System.in);

        System.out.println("Enter the input number:");
        input = number.nextInt();
        temp = input;

        while (temp > 0) {
            rem = temp % 10;
            if(rem % 2 == 0) {
                evensum = evensum + rem;
            }
            sum = sum * 10 + rem;
            temp = temp / 10;
        }


        if (sum==input) {
            if(evensum>25) {
                System.out.println(sum + "is palindrome and the sum of even numbers is greater than 25");
            }
            else {
                System.out.println(sum + "is palindrome and the sum of even numbers is greater than 25");
            }
        }
        else {
            System.out.println(sum + " is not palindrome");
        }
    }
}
package com.stackroute.pe1;

import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {

        int input, sum = 0;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the input numbers:");

        while ((input = number.nextInt()) != 0) {
            sum = sum + input;
        }
        System.out.println(""+sum);

    }



    }


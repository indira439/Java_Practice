package com.stackroute.pe1;

import java.util.ArrayList;
import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input_number = sc.nextInt();
        int sum = 0;

        for (int i = 0; input_number > 0; i++) {

            int buffer = input_number % 10;
            if (buffer % 2 == 0) {
                sum = sum + buffer;
            }
            digits.add(buffer);
            input_number = input_number / 10;
        }
        Collections.sort(digits);
        Collections.reverse(digits);
        System.out.println(digits);
        System.out.println(sum);
        if (sum > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}


package com.stackroute.pe1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        char[] input;
        char rev[] = {};
        int i;
        int j = 0;

        Scanner a = new Scanner(System.in);

        System.out.println("Enter the input string");
        input = a.next().toCharArray();

        System.out.println("Reversed string is :");

        for(i = input.length-1; i >= 0; i--){
            System.out.print(input[i]);
        }

    }
}

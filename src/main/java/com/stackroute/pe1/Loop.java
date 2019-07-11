package com.stackroute.pe1;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        int input , j;
        int i = 1;

        Scanner number = new Scanner(System.in);

        System.out.println("Enter the input number:");
        input = number.nextInt();

        while (i <= input) {
            for(j = 1; j <= i; j++) {
                System.out.print(i);
            }
            i++;
        }
    }
}

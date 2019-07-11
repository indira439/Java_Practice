package com.stackroute.pe1;

import java.util.Scanner;

public class InputTypeCheck {

    public static void main(String[] args) {

        char a;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the input string :");
        a = input.next().charAt(0);

        if (a >= 'a' && a <= 'z') {
            System.out.println("Entered character is a Small letter");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("Entered character is a Capital letter");

        } else if (a >= '0' && a <= '9') {
            System.out.println("Entered character is a digit");
        } else {
            System.out.println("Entered character is a special symbol");
        }
    }
}


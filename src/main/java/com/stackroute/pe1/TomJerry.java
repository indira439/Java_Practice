package com.stackroute.pe1;

import java.util.Scanner;

public class TomJerry {

    public static void main(String[] args) {

        int input;

        Scanner number = new Scanner(System.in);

        System.out.println("Enter the input number:");
        input = number.nextInt();

        if ((input % 2 == 0) && (input >= 20 && input <= 30)) {
            System.out.println("Jerry");
        }

        if ((input % 2 != 0) && (input >= 20 && input <= 30)) {
            System.out.println("Tom");
        }

    }

}


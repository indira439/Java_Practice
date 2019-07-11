package com.stackroute.pe1;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args){

        int i = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the input string :");
        char a[] = input.next().toCharArray();


        for (i = 0; i < a.length ; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
                System.out.println("Entered character " + a + " is  Vowel");
            }
            else if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z')) {
                System.out.println("Entered character " + a + " is Consonant");
            }
            else {
                System.out.println("input is not an alphabet");
            }
        }
    }
}



package com.stackroute.pe1;

import java.util.Scanner;


public class LastRepeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter number of repeats");
        int number = sc.nextInt();
        for (int i = 0;i<str.length()-number; i++) {
            System.out.print(str.charAt(i));
        }
        for (int i = 0; i < number+1; i++) {
            for (int j = str.length() - number; j < str.length(); j++) {
                System.out.print(str.charAt(j));
            }
        }
    }
}

package com.stackroute.pe1;

/**
 * Practice Exercise Question - 4
 * Class uses a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
 * 6 6 . . . nth iteration.
 */
public class Loop {

    public int[] printer(int num){
        //initialize size to 0
        int size = 0;
        //initialize index to 0
        int index = 0;
        //loop to repeat the given number
        for (int i = 1; i <= num; i++)
            size += i;
        int[] resultArray = new int[size];
        for (int i = 1; i <= num; i++){
            for (int j = 0; j < i; j++) {
                resultArray[index] = i;
                index++;
            }
        }
        //return the resultArray
        return resultArray;
    }
}

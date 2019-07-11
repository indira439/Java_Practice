package com.stackroute.pe1;

public class JunitDemo {

    public String ConcatAndUpperCase(String str1, String str2){

        if(str1==null || str2==null)
        {
            return ("null value not allowed");
        }
        String concatedString = str1.concat(str2);
        return concatedString.toUpperCase();
    }

    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

    }
}

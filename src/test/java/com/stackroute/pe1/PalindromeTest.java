package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        palindrome = null;
    }

    @Test
    public void givenNumberShouldReturnMessage() {
        long number = 2468642;
        String result = palindrome.palindromeChecker(number);
        /*Assert*/
        assertEquals(number + "is a palindrome and the sum of even numbers is greater than 25", result);
        number = 12345;
        result = palindrome.palindromeChecker(number);
        assertEquals(number + "is not a palindrome", result);

    }
}
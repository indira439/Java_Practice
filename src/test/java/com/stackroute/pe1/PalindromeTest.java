package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp(){
        //arrange
        this.palindrome = new Palindrome();
    }

    @After
    public void teardown() {
        //arrange
        System.out.println("Inside After");
       palindrome= null;
    }

    @Test
    public void givenIntegerShouldReturnNotAPalindrome() {
        //act
        String actualResult = this.palindrome.palindromeSum(45634);
        //assert
        assertEquals("Not a palindrome", actualResult);
    }

    @Test
    public void givenIntegerShouldReturnPalindromeGreaterThan25() {
        //act
        String actualResult = this.palindrome.palindromeSum(4444444);
        //assert
        assertEquals("Palindrome and greater than 25", actualResult);
    }

    @Test
    public void givenIntegerShouldReturnPalindromeLesserThan25() {
        //act
        String actualResult = this.palindrome.palindromeSum(99899);
        //assert
        assertEquals("Palindrome and lesser than 25", actualResult);
    }


}
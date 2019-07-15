package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverseString;

    @Before
    public void setup() {
        //arrange
        this.reverseString = new ReverseString();
    }

    @After
    public void teardown() {
        //arrange
        reverseString = null;
    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String actualResult = reverseString.reverseStringChecker("indu");
        //assert
        assertEquals("udni", actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnShouldThrowNullpointException() {
        //act
        String result = reverseString.reverseStringChecker(null);
        //assert
    }

}
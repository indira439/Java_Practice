package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfIntegersTest {

    SumOfIntegers sumOfIntegers;

    @Before
    public void setUp() {
        this.sumOfIntegers = new SumOfIntegers();
    }

    @After
    public void tearDown() {
        sumOfIntegers = null;
    }


    @Test
    public void givenNumericStringShouldReturnSumOfDigits() {
        //act
        String actualResult = sumOfIntegers.sumOfIntegers("10 20 30 40");
        //assert
        assertEquals("100", actualResult);
    }

    @Test
    public void givenNumericStringShouldReturnSumOfDigitsFailure() {
        //act
        String actualResult = sumOfIntegers.sumOfIntegers("10 20 30 40");
        //assert
        assertNotEquals("10", actualResult);
    }

    @Test
    public void givenAlphaNumericStringShouldReturnErrorMessage() {
        //act
        String actualResult = sumOfIntegers.sumOfIntegers("12 6i");
        //assert
        assertEquals("Non Integer Value", actualResult);
    }


    @Test
    public void givenNegativeAndPositiveValueShouldReturnZero() {
        //act
        String actualResult = sumOfIntegers.sumOfIntegers("60 -60");
        //assert
        assertEquals("0", actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNullPointerException() {
    sumOfIntegers.sumOfIntegers(null);
    }


}
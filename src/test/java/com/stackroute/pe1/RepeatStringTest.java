package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {

    RepeatString repeatString;

    @Before
    public void setup() {
        this.repeatString = new RepeatString();
    }

    @After
    public void tearDown() {
        repeatString = null;
    }

    @Test
    public void givenAStringAndNumberShouldReturnStringRepeatingFromGivenNumber() {
        //act
        String actualResult = repeatString.lastRepeat("indu", 2);
        //assert
        assertEquals("indududu",actualResult);
    }

    @Test
    public void givenAStringAndNumberShouldReturnStringRepeatingFromGivenNumberFailure() {
        //act
        String actualResult = repeatString.lastRepeat("indu", 2);
        //assert
        assertNotEquals("inddudu",actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        repeatString.lastRepeat(null,6);
    }
}
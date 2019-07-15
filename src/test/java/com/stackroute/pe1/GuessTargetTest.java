package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTargetTest {
    GuessTarget guessTarget;


    @Before
    public void setup() {
        //arrange
        this.guessTarget = new GuessTarget();
    }

    @After
    public void teardown() {
        //arrange
        guessTarget = null;
    }

    @Test
    public void givenGuessedIntegerShouldReturnTargetLesserThanGuessedNumber() {
        //act
        String result  = guessTarget.guessTargetNumber(15);
        //assert
        assertEquals("Guessed number is lesser than target",result);

    }

}
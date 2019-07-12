package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    TomJerry tomJerry;

    @Before
    public void setUp() {
        //arrange
        this.tomJerry = new TomJerry();
    }

    @Test
    public void givenIntegerShouldReturnNotInRange() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(10);
        //assert
        assertEquals("Not in between 20 and 30", actualResult);
    }

    @Test
    public void givenIntegerShouldReturnTom() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(21);
        //assert
        assertEquals("Tom", actualResult);
    }

    @Test
    public void givenIntegerShouldReturnJerry() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(24);
        //assert
        assertEquals("Jerry", actualResult);
    }
}
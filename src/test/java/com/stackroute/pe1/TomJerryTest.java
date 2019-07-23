package com.stackroute.pe1;

import org.junit.After;
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

    @After
    public void tearDown() {
        tomJerry = null;
    }

    @Test
    public void givenIntegerNotBetween20And30ShouldReturnNotInRange() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(10);
        //assert
        assertEquals("Not in between 20 and 30", actualResult);
    }

    @Test
    public void givenOddIntegerBetween20And30ShouldReturnTom() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(21);
        //assert
        assertEquals("Tom", actualResult);
    }

    @Test
    public void givenOddIntegerBetween20And30ShouldReturnTomFailure() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(21);
        //assert
        assertNotEquals("Jerry", actualResult);
    }

    @Test
    public void givenEvenIntegerBetween20And30ShouldReturnJerry() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(24);
        //assert
        assertEquals("Jerry", actualResult);
    }

    @Test
    public void givenEvenIntegerBetween20And30ShouldReturnJerryFailure() {
        //act
        String actualResult = this.tomJerry.tomOrJerryFinder(24);
        //assert
        assertNotEquals("Tom", actualResult);
    }
}
package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {

    Loop loop;

    @Before
    public void setUp() {
        this.loop = new Loop();
    }

    @After
    public void teardown() {
        //arrange
        System.out.println("Inside After");
        loop= null;
    }


    @Test
    public void givenNumberShouldReturnAnArray() {
        //act
        int[] actualResult = this.loop.printer(4);
        //assert
        int[] expectedResult = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberShouldReturnAnArrayOfLengthOne() {
        //act
        int[] actualResult = this.loop.printer(1);
        //assert
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test (expected = OutOfMemoryError.class)
    public void givenNumberShouldReturnAnOutOfMemoryError() {
        //act
        int[] actualResult = this.loop.printer(100000000);
    }

    @Test
    public void givenNumberShouldReturnAnEmptyArray() {
        //act
        int[] actualResult = this.loop.printer(0);
        //assert
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, actualResult);
    }



}
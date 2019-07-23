package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DescendingOrderTest {

    DescendingOrder descendingOrder;

    @Before
    public void setUp() {
        descendingOrder = new DescendingOrder();
    }

    @After
    public void tearDown() {
        descendingOrder = null;
    }

    @Test
    public void givenAnIntegerWithSumOfEvenNumbersGreaterThan25ShouldReturnTrueValue() {
        //act
        boolean actualResult = this.descendingOrder.sumOfInteger(234283);
        //assert
        assertEquals(true, actualResult);
    }

    @Test
    public void givenAnIntegerWithSumOfEvenNumbersLessThan25ShouldReturnFalseValue() {
        //act
        boolean actualResult = this.descendingOrder.sumOfInteger(23423);
        //assert
        assertEquals(false, actualResult);
    }
    @Test
    public void givenAnIntegerWithSumOfEvenNumbersGreaterThan25ShouldReturnTrueValueFailure() {
        //act
        boolean actualResult = this.descendingOrder.sumOfInteger(23423);
        //assert
        assertNotEquals(true, actualResult);
    }

    @Test
    public void givenAnIntegerWithSumOfEvenNumbersLessThan25ShouldReturnFalseValueFailure() {
        //act
        boolean actualResult = this.descendingOrder.sumOfInteger(2423);
        //assert
        assertEquals(false, actualResult);
    }

    @Test(expected = NumberFormatException.class)
    public void givenNullShouldThrowNullPointerException() {
        descendingOrder.sumOfInteger(-9);
    }


}
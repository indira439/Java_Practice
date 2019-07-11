package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {

    JunitDemo junitDemo;

    @Before
    public void setup() {
        //arrange
        System.out.println("Inside Before");
        this.junitDemo = new JunitDemo();
    }

    @After
    public void teardown() {
        //arrange
        System.out.println("Inside After");
        junitDemo = null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }


    @Test
    public void givenTwoStringsShouldReturnConcatedUpperString() {

        //act
        String result = junitDemo.ConcatAndUpperCase("indu", "shiva");
        //assert
        assertNotNull(result);
        assertEquals("INDUSHIVA", result);

    }

    @Test
    public void givenAStringAndNullShouldReturnErrorMessage() {
        //act
        String result = junitDemo.ConcatAndUpperCase("shiva", null);
        //assert
        assertNotNull(result);
        assertEquals("null value not allowed", result);
    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String result = junitDemo.reverseString("indu");
        //assert
        assertEquals("udni", result);

    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnShouldThrowNullpointException() {
        //act
        String result = junitDemo.reverseString(null);
        //assert
        //assertEquals("null value not allowed", result);


    }

}
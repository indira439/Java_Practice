package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {

        VowelOrConsonant vowelOrConsonant;

        @Before
        public void setUp() {
            this.vowelOrConsonant = new VowelOrConsonant();
        }

        @Test
        public void givenStringShouldReturnNotALetter() {
            //act
            String actualResult[] = this.vowelOrConsonant.vowelOrConsonantChecker("9");
            //assert
            assertEquals("Not a letter", actualResult[0]);
        }

        @Test(expected = NullPointerException.class)
        public void givenStringShouldReturnNullPointerException() {
            //act
            this.vowelOrConsonant.vowelOrConsonantChecker(null);
            //assert
        }


        @Test
        public void givenStringShouldReturnAnArrayWithAllPossibleResult() {
            //act
            String[] actualResult = this.vowelOrConsonant.vowelOrConsonantChecker("is9");
            //assert
            String[] expected = {"Vowel", "Consonant", "Not a letter"};
            assertArrayEquals(expected, actualResult);
        }
    }

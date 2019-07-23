package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {

    VowelOrConsonant vowelOrConsonant;

    @Before
    public void setUp() {
        this.vowelOrConsonant = new VowelOrConsonant();
    }

    @After
    public void teardown() {
        //arrange
        vowelOrConsonant = null;
    }


    @Test
    public void givenDigitShouldReturnErrorMessage() {
        //act
        String actualResult[] = this.vowelOrConsonant.vowelOrConsonantChecker("9");
        //assert
        assertEquals("Not a letter", actualResult[0]);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNullPointerException() {
        //act
        this.vowelOrConsonant.vowelOrConsonantChecker(null);
        //assert
    }


    @Test
    public void givenStringShouldReturnAnArrayWithTypeOfCharacter() {
        //act
        String[] actualResult = this.vowelOrConsonant.vowelOrConsonantChecker("is9");
        //assert
        String[] expected = {"Vowel", "Consonant", "Not a letter"};
        assertArrayEquals(expected, actualResult);
    }

    @Test
    public void givenVowelCharacterShouldReturnVowel() {
        //act
        String[] actualResult = this.vowelOrConsonant.vowelOrConsonantChecker("I");
        //assert
        String[] expected = {"Vowel"};
        assertArrayEquals(expected, actualResult);
    }

    @Test
    public void givenConsonantCharacterShouldReturnConsonant() {
        //act
        String[] actualResult = this.vowelOrConsonant.vowelOrConsonantChecker("Z");
        //assert
        String[] expected = {"Consonant"};
        assertArrayEquals(expected, actualResult);
    }

    @Test
    public void givenDigitShouldReturnNotALetter() {
        //act
        String[] actualResult = this.vowelOrConsonant.vowelOrConsonantChecker("9");
        //assert
        String[] expected = {"Not a letter"};
        assertArrayEquals(expected, actualResult);
    }
}

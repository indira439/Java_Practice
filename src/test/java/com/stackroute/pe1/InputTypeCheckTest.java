package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputTypeCheckTest {

    InputTypeCheck characterType;

    @Before
    public void setUp(){
        //arrange
        this.characterType = new InputTypeCheck();
    }

    @Test
    public void givenCharacterShouldReturnLowerCase() {
        //act
        String actualResult = this.characterType.inputTypeChecker('i');
        //assert
        assertEquals("Lowercase letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnUpperCase() {
        //act
        String actualResult = this.characterType.inputTypeChecker('I');
        //assert
        assertEquals("Capital letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnDigit() {
        //act
        String actualResult = this.characterType.inputTypeChecker('6');
        //assert
        assertEquals("Digit", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnSpecialSymbol() {
        //act
        String actualResult = this.characterType.inputTypeChecker('@');
        //assert
        assertEquals("Special symbol", actualResult);
    }
}
package com.stackroute.pe1;

import java.util.Scanner;

public class InputTypeCheck {

        public String inputTypeChecker(char inputCharacter){
            String characterType = "";
            if (Character.isAlphabetic(inputCharacter)) {
                if (Character.isUpperCase(inputCharacter)) {
                    characterType = "Capital letter";
                } else if (Character.isLowerCase(inputCharacter)) {
                    characterType = "Lowercase letter";
                }
            }
            else if (Character.isDigit(inputCharacter)){
                characterType = "Digit";
            }
            else {
                characterType = "Special symbol";
            }

            return characterType;
        }
}


package com.stackroute.pe1;

/**
 * Practice Exercise Question - 6
 * Class that takes a character from the user as input and determines whether the
 * character entered is a capital letter, a small case letter, a digit or a special symbol and display
 * appropriately.
 */
public class InputTypeCheck {

        public String inputTypeChecker(char inputCharacter){
            String characterType = "";

            /**check whether input is alphabetic or not*/
            if (Character.isAlphabetic(inputCharacter)) {
                if (Character.isUpperCase(inputCharacter)) {

                    /**if character is in upper case return as capital character*/
                    characterType = "Capital letter";
                } else if (Character.isLowerCase(inputCharacter)) {

                    /**if character is in upper case return as lower case character*/
                    characterType = "Lowercase letter";
                }
            }
            else if (Character.isDigit(inputCharacter)){

                /**if input is between 0-9 return as digit*/
                characterType = "Digit";
            }
            else {
                /**if input is not a character, not a digit return it as special symbol*/
                characterType = "Special symbol";
            }

            return characterType;
        }
}


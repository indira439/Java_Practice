package com.stackroute.pe1;

/**
 * Practice Exercise Question - 3
 * Class that accepts a word as input and checks for each single character letter in
 * the word whether it is a consonant or vowel.
 * Condition:
 * a. Print an error message if the input is not a letter
 * b. If the input having more than one letter, print the required output
 * (Vowel or Consonant) for each letter
 */
public class VowelOrConsonant {

        public String[] vowelOrConsonantChecker(String string) {
            String[] returnResult = new String[string.length()];
            for(int i = 0; i <= string.length() - 1; i++){
                char character = string.charAt(i);
                if(Character.isAlphabetic(character)){
                    if (character == 'a' || character == 'A' || character == 'e' || character == 'E'
                            || character == 'i' || character == 'I' || character == 'o' || character == 'O'
                            || character == 'u' || character == 'U'){
                        returnResult[i] = "Vowel";
                    }
                    else {
                        returnResult[i] = "Consonant";
                    }
                }
                else {
                    returnResult[i] = "Not a letter";
                }
            }
            return returnResult;
        }
}



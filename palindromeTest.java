package com.sparta.fw.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromeTest {
    @Test
    @DisplayName("Check if a Palindrome word returns as a palindrome")
    void checkIfPalidromeWorks(){
        Assertions.assertEquals("This is a palindrome",palindrome.isPalindrome("madam"));
    }
    @Test
    @DisplayName("Check if long palindrome word returns as palindrome")
    void checkIfPalidromeRecognisesLongWord(){
        Assertions.assertEquals("This is a palindrome",palindrome.isPalindrome("saippuakivikauppias"));
    }
    @Test
    @DisplayName("Check whether word with uppercase letters are recognised")
    void checkIfUppercaselettersAreRecognised(){
        Assertions.assertEquals("This is a palindrome", palindrome.isPalindrome("mAdAm"));

    }

}
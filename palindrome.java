package com.sparta.fw.palindrome;

public class palindrome {
    //sting array, count words, how many letters in words, words >= 6 to see if palindrome, check if palindrome, return word in new array
    public static void main(String[] args) {
        String sentence = "This";
        char[] letters = sentence.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
    }
}


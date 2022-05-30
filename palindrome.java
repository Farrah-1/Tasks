package com.sparta.fw.palindrome;

public class palindrome {
    //sting array, count words, how many letters in words, words >= 6 to see if palindrome, check if palindrome, return word in new array
    public static void main(String[] args) {
        String sentence = "MadAm";
        //sentence.toLowerCase();
        String word = sentence.toLowerCase();
        String Checker = isPalindrome(word);
        System.out.println(Checker);
    }

    public static String isPalindrome(String word) {
        char[] letters = word.toCharArray(); // to individual characters
        String message;
        String reversedString = "";
        // length shows 4 digits where java wants 3
        for (int i = letters.length - 1; i >= 0; i--){
            reversedString += letters[i];
        }
        if (word.equals(reversedString)){
            message = "This is a palindrome";
        }else{
            message = "Sorry this is not a palindrome, better luck next time!";
        }
        return message;
    }
}

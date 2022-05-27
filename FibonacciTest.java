package com.sparta.fw;

import com.sparta.fw.Fibonacci.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciTest {
    @Test
    @DisplayName("Check number returned is 0")
        void checkNumberReturned0 () {
            Assertions.assertEquals(0, Fibonacci.getFibonacciNumberAtIndex(0));}

    @Test
    @DisplayName("Check number returned is 1")
        void checkNumberReturned1 () {
            Assertions.assertEquals(1, Fibonacci.getFibonacciNumberAtIndex(2));}

    @Test
    @DisplayName("Check number returned is 2")
    void checkNumberReturned2(){
        Assertions.assertEquals(2,Fibonacci.getFibonacciNumberAtIndex(4));
    }
    @Test
    @DisplayName("Check number returned is 3")
    void checkNumberReturned5(){
        Assertions.assertEquals(3,Fibonacci.getFibonacciNumberAtIndex(5));
    }

    @Test
    @DisplayName("Check number returned is 377")
    void checkNumberReturned377(){
        Assertions.assertEquals(377,Fibonacci.getFibonacciNumberAtIndex(15));
    }

    @Test
    @DisplayName("Check null returns 0")
    void checkNullValueReturns0(){
        Assertions.assertEquals(0,Fibonacci.getFibonacciNumberAtIndex(null));
    }
    @Test
    @DisplayName("Check negative number returns 0")
    void checkNegativeValueReturns0(){
        Assertions.assertEquals(0,Fibonacci.getFibonacciNumberAtIndex(-1));
    }
    @Test
    @DisplayName("Return first 5 numbers in fibonacci")
    void retrunFirst5NumbersInFibonacci(){
        ArrayList<Integer> testOne = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3));
        Assertions.assertArrayEquals(testOne.toArray(),Fibonacci.getFibonacciSequence(5).toArray());
    }
}

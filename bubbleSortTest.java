package com.sparta.fw.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bubbleSortTest {

    @Test
    @DisplayName("Check whether large numbers are sorted properly")
    void checkLargeNumbersSorted(){
        int[] actual = {3523, 235235, 3234, 3523, 657568};
        int[] expected = {3234, 3523, 3523, 235235, 657568};
        bubbleSort.Bubble(actual);
        Assertions.assertArrayEquals(expected,actual);}

    @Test
    @DisplayName("Check whether same numbers will be sorted correctly")
    void sameNumberSorts(){
        int[] actual = {23, 23, 644, 23, 24};
        int[] expected = {23, 23, 23, 24, 644};
        bubbleSort.Bubble(actual);
        Assertions.assertArrayEquals(expected,actual);}

    @Test
    @DisplayName("Check whether similar numbers will be sorted")
    void similarNumber(){
        int[] actual = {29, 24, 27, 23, 28};
        int[] expected = {23, 24, 27, 28, 29};
        bubbleSort.Bubble(actual);
        Assertions.assertArrayEquals(expected,actual);}

    @Test
    @DisplayName("Check whether negative numbers will be sorted")
    void negativeNumbers(){
        int[] actual = {-1, -24, -422, -48, -28};
        int[] expected = {-422, -48, -28, -24, -1};
        bubbleSort.Bubble(actual);
        Assertions.assertArrayEquals(expected,actual);}
}

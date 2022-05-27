package com.sparta.fw.bubblesort;

public class bubbleSort {
    public static void Bubble(int[] sorter) {
        int al = sorter.length;
        for (int i = 0; i < al; i++) {
            for (int x = 0; x < al - 1; x++) {
                if (sorter[x + 1] < sorter[x]) {
                    int swap = sorter[x];
                    sorter[x] = sorter[x + 1];
                    sorter[x + 1] = swap;

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1, -24, -422, -48, -28};
        int al = arr.length;
        Bubble(arr);

        for (int i = 0; i < al; i++) {
            System.out.print(arr[i] + " "); // i prints individual numbers from start (0) with spaces in between
        }
    }
}


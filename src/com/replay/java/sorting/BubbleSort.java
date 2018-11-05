package com.replay.java.sorting;

/**
 * Created by Amit PREMI on 05-Nov-18.
 */
public class BubbleSort {

    public static void main(String[] args) {
        sortArray();
    }

    private static void sortArray() {
        int[] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        int count = 0;
        while (count < arr.length) {

            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            count++;
        }
        System.out.print("Sorted Array: ");
        for (int arrValue : arr) {
            System.out.print(arrValue + " ");
        }
    }
}

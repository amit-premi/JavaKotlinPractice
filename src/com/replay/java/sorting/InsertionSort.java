package com.replay.java.sorting;

/**
 * Created by Amit PREMI on 05-Nov-18.
 */
public class InsertionSort {

    public static void main(String[] args) {
        sortArray();
    }

    private static void sortArray() {
        int[] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        for(int i=1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        System.out.print("Sorted Array: ");
        for (int arrValue : arr) {
            System.out.print(arrValue + " ");
        }
    }
}

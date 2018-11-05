package com.replay.java.sorting;

/**
 * Created by Amit PREMI on 05-Nov-18.
 */
public class SelectionSort {

    public static void main(String[] args) {
        sortArray();
    }

    private static void sortArray() {
        int[] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};

        for(int i=0; i< arr.length; i++){
            int pos = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[pos] > arr[j]){
                    pos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }

        System.out.print("Sorted Array: ");
        for (int arrValue : arr) {
            System.out.print(arrValue + " ");
        }
    }
}

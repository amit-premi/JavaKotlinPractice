package com.replay.java.common;

import java.util.Scanner;

/**
 * Created by Amit PREMI on 04-Nov-18.
 */
public class FibonacciSeries {

    public static void main(String[] args) {

        //get the Fibonacci
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide Fab Series Count: ");
        int fabCount = sc.nextInt();

        System.out.println("Fibonacci Series Iteration " + fabCount + ": " + getFibonacci(fabCount));

        System.out.print("Fibonacci Series Recursion " + fabCount + ": ");
        for(int j=0; j< fabCount; j++){
            System.out.print(recurFibonacci(j) +" ");
        }
    }

    //Using Iteration
    private static String getFibonacci(int seriesCount) {
        String fabStr = "";
        if (seriesCount <= 2) {
            int count = 1;

            while (count <= seriesCount) {
                fabStr = fabStr +" "+ count++;
            }
            return fabStr;
        } else {

            int f1 = 1, f2 = 1, fSum = 0;
            fabStr = f1 + " " + f2;
            for (int i = 0; i < seriesCount - 2; i++) {
                fSum = f1 + f2;
                f1 = f2;
                f2 = fSum;

                fabStr = fabStr +" "+ fSum;
            }

            return fabStr;
        }
    }

    //Using Recursion
    private static int recurFibonacci(int fabCount){
        if(fabCount < 2){
            return 1;
        }
        return recurFibonacci(fabCount - 1) + recurFibonacci(fabCount - 2);
    }
}

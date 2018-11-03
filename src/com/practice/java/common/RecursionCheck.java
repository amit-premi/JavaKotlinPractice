package com.practice.java.common;

public class RecursionCheck {

    public static void main(String args[]) {
        RecursionCheck recurObj = new RecursionCheck();
        int result = recurObj.print(4);
        System.out.println("Result: " + result);

    }

    private int print(int n) {
        if (n == 0) {
            System.out.println("Value of n==0");
            return 1;
        } else {
            int val = n * print(n - 1);
            System.out.println("Value of n: " + val);
            return val;
        }
    }
}

package com.replay.java.common;

/**
 * Created by Amit PREMI on 05-Nov-18.
 */
public class LoopTree {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i=0; i<10; i++) {
            for (int j=1; j<10-i; j++) {
                for (int k = 10 - 1; k > 0; k--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

package com.replay.techgig;

import java.util.Scanner;

/**
 * Created by Amit PREMI on 18-Sep-18.
 */
public class SampleTestCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        String result = "not prime";
        if (numb > 2) {
            for (int i = 2; i < numb / 2; i++) {
                if (numb % i == 0) {
                    result = "prime";
                    break;
                }
            }
        } else if (numb == 2) {
            result = "prime";
        }
        System.out.println(result);
    }
}

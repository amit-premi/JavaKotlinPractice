package com.practice.java.test;

import java.util.Scanner;

public class OddEvenTest {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to check Odd/Even: ");
        int numbCheck = scanner.nextInt();

        if ((numbCheck & 1) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
        scanner.close();
    }
}

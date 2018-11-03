package com.practice.java.common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputStreamTest {

    public static void main(String args[]) throws InputMismatchException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Gender: ");
        char gender = (sc.nextLine()).charAt(0);

        System.out.print("Profession: ");
        String prof = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Profession: " + prof);
        System.out.println("Address: " + address);

        String tempStr = "";
        System.out.print("Enter no. of multi-line expect: ");
        int lineCount = sc.nextInt();
        for (int i = 0; i < lineCount; i++) {
            tempStr = tempStr.concat(" ").concat(sc.nextLine());
        }
        System.out.println("Multi-line String: " + tempStr);

        sc.close();
    }
}

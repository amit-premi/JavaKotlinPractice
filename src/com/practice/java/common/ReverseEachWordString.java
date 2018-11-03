package com.practice.java.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseEachWordString {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input String: ");

        String inputStr = br.readLine();
        //System.out.println(inputStr);
        int inStrLength = inputStr.length();

        String resultStr = "";
        //Reverse String
        for (int i = inStrLength - 1; i >= 0; i--) {
            resultStr = resultStr + "" + inputStr.charAt(i);
        }

        System.out.println("String Reverse Output: " + resultStr);

        //Each word reverse of the string
        String tempStr = "";
        resultStr = "";
        for (int j = inStrLength - 1; j >= 0; j--) {

            if (inputStr.charAt(j) != ' ') {
                tempStr = tempStr + "" + inputStr.charAt(j);
            } else {
                resultStr = tempStr + " " + resultStr;
                tempStr = "";
            }

            if (j == 0) {
                resultStr = tempStr + " " + resultStr;
            }
        }
        System.out.println("String word's reverse Output: " + resultStr);
    }
}

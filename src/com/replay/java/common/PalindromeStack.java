package com.replay.java.common;

import java.util.Stack;

/**
 * Created by Amit PREMI on 28-Oct-18.
 */
public class PalindromeStack {

    public static void main(String[] args) {

        String[] inputArray = {"A", "b", "$", "D", "#", "@", "#", "d", "$", "B", "a"};

        StringBuilder strBuilder = new StringBuilder();
        Stack<String> strStack = new Stack<>();

        for (String StrInput : inputArray) {
            strBuilder.append(StrInput);
            strStack.push(StrInput);
        }

        boolean isPalindrome = true;
        for (int j = 0; j < inputArray.length; j++) {

            String strValue = String.valueOf(strBuilder.charAt(j));
            if (!strValue.equalsIgnoreCase(strStack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("String is Palindrome: " + isPalindrome);
    }
}

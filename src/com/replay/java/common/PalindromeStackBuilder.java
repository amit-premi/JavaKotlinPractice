package com.replay.java.common;

import java.util.Stack;

/**
 * Created by Amit PREMI on 04-Nov-18.
 */
public class PalindromeStackBuilder {

    public static void main(String[] args){

        String[] inputArray = {"A", "b", "$", "D", "#", "@", "#", "d", "$", "B", "a"};

        StringBuilder strBuilder = new StringBuilder();
        Stack<String> strStack = new Stack<>();

        for(String value : inputArray){
            strBuilder.append(value);
            strStack.push(value);
        }

        boolean isPalindrome = true;
        for(int j=0; j<inputArray.length; j++){
            String strValue = String.valueOf(strBuilder.charAt(j));
            if(!strValue.equalsIgnoreCase(strStack.pop())){
                isPalindrome = false;
            }
        }

        System.out.println("Is String Palindrome: "+isPalindrome);
    }
}

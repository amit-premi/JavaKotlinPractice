package com.practice.java.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the string:");
		String inStr = br.readLine();
		int lengthStr = inStr.length();

		String outStr = "";
		for(int i=(lengthStr-1); i>=0; i--) {
			outStr = outStr + inStr.charAt(i);
		}

		System.out.print("Reverse String: "+outStr);
	}
}

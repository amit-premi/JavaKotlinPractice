package com.practice.java.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringWords {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String value: " +"\n \t");
		String str = br.readLine();
		int strLength = str.length();

		String temp = "";
		String strOutput = "";

		for(int i=strLength-1; i>=0; i--) {
			if(str.charAt(i) != ' ') {
				temp = temp +""+ str.charAt(i);

				if(i==0){
					strOutput = temp +" "+ strOutput;
				}
			}else {
				strOutput = temp+ " "+ strOutput;
				temp = "";				
			}
		}

		System.out.print("Final Output String: " +"\n \t"+ strOutput);
	}
}

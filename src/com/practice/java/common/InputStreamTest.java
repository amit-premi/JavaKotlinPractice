package com.practice.java.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreamTest {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter name: ");
		String name = br.readLine();

		System.out.print("Gender: ");
		char gender = br.readLine().charAt(0); 

		Scanner sc = null;;
		Scanner scBr = null;
		try {
			sc = new Scanner(System.in);

			System.out.print("Profession: ");
			String prof = sc.nextLine();

			scBr = new Scanner(br);

			System.out.print("Address: ");
			String address = scBr.nextLine();

			System.out.println("Name: " +name);
			System.out.println("Gender: " +gender);
			System.out.println("Profession: " +prof);
			System.out.println("Address: " +address);

			String testStr = "";
			String tempStr = "";		

			System.out.print("Enter no. of multi-line expect: ");
			int lineCount = Integer.parseInt(br.readLine());
			for(int i=0; i<lineCount; i++) {
				tempStr = testStr;
				testStr = br.readLine();
				testStr = tempStr +" " +testStr;				
			}
			System.out.println("Multi-line String: " +testStr);
		} finally {
			sc.close();
			scBr.close();
		}		
	}
}

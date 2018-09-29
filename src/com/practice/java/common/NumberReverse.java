package com.practice.java.common;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		
		System.out.print("Please enter number to reverse: ");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		
		if(Integer.toString(numb).length() < 2) {
			System.out.print("Please enter number of atleast 2 digits: ");
			numb = sc.nextInt();
		}
		
		int reverseNumb = reverse(numb);
		System.out.println("Reverse Numb result: "+reverseNumb);
		
		sc.close();
	}
	
	//Method to reverse the Numbers
	private static int reverse(int num) {
		
		//1st Approach
		/*String tempResult = "";
		int length = Integer.toString(num).length();
		
		for(int i=0; i<length; i++) {
			tempResult = tempResult + num % 10;
			num = num/10;
		}
		
		return Integer.valueOf(tempResult);*/
		
		//2nd Approach
		int tempResult = 0;
		do {
			tempResult = (tempResult * 10) + num%10;
			num = num/10;			
		}while(num > 0);
		
		return tempResult;
	}
}

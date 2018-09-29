package com.practice.java.practice;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fibonacci Series Count");
		int x = sc.nextInt();
		
		System.out.print("Recurrion Call: ");
		for(int j=1; j< x; j++) {
			System.out.print(recurFibonacci(j) +" ");
		}
		
		
		System.out.print("\nIteration Call: ");
		for(int k=1; k< x; k++) {
			System.out.print(iteratFibonacci(k) +" ");
		}
	}

	private static int recurFibonacci(int numb) {
		if(numb == 1 || numb == 2) {
			return 1;
		}
		return recurFibonacci(numb-1) + recurFibonacci(numb-2);
	}
	
	private static int iteratFibonacci(int num) {
		
		if(num == 1 || num ==2) {
			return 1;
		}
		
		int f1 = 1, f2 = 1, f = 1;
		
		for(int i=3; i<= num; i++) {
			f1 = f;
			f = f1 + f2;
			f2 = f1;
		}
		
		return f;
	}
}

package com.practice.java.practice;

import java.util.Scanner;

public class SwapWith2Var {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		
		System.out.print("A: ");
		int a = sc.nextInt();
		
		System.out.print("B: ");
		int b = sc.nextInt();
		
		/*//One way
	    a = a+b;
	    b = a-b;
	    a = a-b;*/
	    
	    //2nd way
	    a = a^b;
	    b = a^b;
	    a = a^b;
	    
	    System.out.println("Swapped values of  \nA: "+a +"\nB: "+b);
	    sc.close();
	}
}

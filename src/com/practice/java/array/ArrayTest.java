package com.practice.java.array;

import java.io.IOException;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String args[]) throws NumberFormatException, IOException {

		int rowCount;
		int colCount;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Matrix Row Count: ");
		rowCount = sc.nextInt();

		System.out.print("Enter Matrix Column Count: ");
		colCount = sc.nextInt();
		
		System.out.println("Array Row & Col: "+ rowCount +" & "+ colCount);

		int matrix[][] = new int[rowCount][colCount];

		System.out.println("Enter Matrix values for 3x5");
		for(int i=0; i<rowCount; i++)
		for(int j=0; j<colCount; j++)
		matrix[i][j] = sc.nextInt();

		System.out.println("Matrix created/entered: ");
		for(int i=0; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {				
				System.out.print(matrix[i][j] +"\t");
			}
			System.out.print("\n");
		}	
		
		System.out.println("Matrix Transpose value: ");
		for(int i=0; i<colCount; i++) {
			for(int j=0; j<rowCount; j++) {				
				System.out.print(matrix[j][i] +"\t");
			}
			System.out.print("\n");
		}	
	}
}

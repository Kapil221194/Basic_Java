package com.day28;

import java.util.Scanner;

public class StarPatternUsing2DArray {

	public static void patter1(char a[][], int x) {
		System.out.println("\nRight angle triangle pattern :");
		for (int k = 0; k < x; k++) {
			for (int l = 0; l <= k; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void patter2(char a[][], int x) {
		System.out.println("\nSquare pattern :");
		for (int k = 0; k < x; k++) {
			for (int l = 0; l <x; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row range :");
		int n1 = sc.nextInt();
		System.out.print("Enter colomn range :");
		int n2 = sc.nextInt();
		char ar[][] = new char[n1][n2];

		// calling method
		patter1(ar, n1);
		patter2(ar, n1);
	}

}

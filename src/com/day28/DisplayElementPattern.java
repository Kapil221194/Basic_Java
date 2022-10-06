package com.day28;

import java.util.Scanner;

public class DisplayElementPattern {

	public static void displayOuterElements(int a[][]) {
		System.out.println("Display Outer Elements ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 0 || j == 0 || i == a.length - 1 || j == a.length - 1) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void displayElements_N(int a[][]) {
		System.out.println("Display Elements in N pattern ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || j == a.length - 1 || i == j) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print("  ");
				}
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
		int ar[][] = new int[n1][n2];
		System.out.print("Enter elements :");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		// calling method
		displayOuterElements(ar);
		displayElements_N(ar);
	}

}

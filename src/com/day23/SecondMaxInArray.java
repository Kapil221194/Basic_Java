package com.day23;

import java.util.Scanner;

public class SecondMaxInArray {

	public static int SecondMax(int a[]) {
		int temp = 0;
		int i = 0;
		for (; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[i - 2];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Enter array elements:");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("2nd max element from array :"+ SecondMax(ar));
	}
}

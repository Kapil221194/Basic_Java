package com.day23;

import java.util.Scanner;

public class MergeArray {

	public static void Mergging(int a[]) {

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Enter 1st array elements:");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int arr[] = new int[num];
		System.out.println("Enter 2nd array elements:");
		for (int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextInt();
		}

		int mg[] = new int[num + num];
		int count = 0;
		for (int m = 0; m < ar.length; m++) {
			mg[m] = ar[m];
			count++;
		}
		for (int m1 = 0; m1 < arr.length; m1++) {
			mg[count++] = arr[m1];
		}
		for (int i = 0; i <mg.length ; i++) {
			System.out.println(mg[i]+" ");
		}
		Mergging(mg);

	}

}

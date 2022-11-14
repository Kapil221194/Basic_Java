package com.APractice;

public class RotateArray1 {

	public static void rotate(int a[]) {
		int n = 1;
		for (int i = 0; i < n; i++) {
			int first = a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j] = a[j+1];
			}
			a[a.length-1] = first;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		rotate(arr);
	}

}

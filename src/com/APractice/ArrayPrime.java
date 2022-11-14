package com.APractice;

import java.util.Scanner;

public class ArrayPrime {

	public static boolean isPrime(int n) {
		int count = 0;
		boolean flag = false;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count > 0 ) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.println(a[i]);
			}
		}

	}

}

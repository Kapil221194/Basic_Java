package com.APractice;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Enter array elements:");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int sum = 0;
		int count1=0;
		float avg=0;
		for (int i = 0; i < ar.length; i++) {
			int n = ar[i];
			int count = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;
				}
			}

			if (count == 2) {
			} else {
				count1++;
				sum = sum + ar[i];
			}
		}
		//System.out.println("c1=" + count1);
		//System.out.println("sum=" + sum);
		avg=(float)(sum)/(float)(count1);
		System.out.println("avg=" + avg);
	}

}

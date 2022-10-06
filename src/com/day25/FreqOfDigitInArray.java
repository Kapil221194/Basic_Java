package com.day25;

import java.util.Scanner;

public class FreqOfDigitInArray {

	public static void Frequency(int a[]) {
		int c1 = 0;
		for (int i = 0; i < a.length; i++) {
			int c = 1;
			boolean isVisited = false;
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] == a[k]) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						c++;
					}
				}
				System.out.println("for frequency of element.");
				System.out.println(a[i] + " " + c);
				if (c == 1) {
					System.out.println("for unique element.");
					System.out.println(a[i] + " " + c); // for unique element.
				}

				if (c > 1) {

					System.out.println("for condition of element more than one.");
					System.out.println(a[i] + " " + c); // for condition of element more than one.
					c1++;
				}
				System.out.println("for count of element more than one :" + c1);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range of array :");
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Enter range of array :");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		Frequency(ar);
	}

}

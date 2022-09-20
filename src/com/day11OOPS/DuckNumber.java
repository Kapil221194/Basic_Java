package com.day11OOPS;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = 0, count = 0, org_num = num;

		while (true) {
			r = num % 10;
			//System.out.println(r);
			if (r == 0)
				count++;
			num = num / 10;
			//System.out.println(count);
			if (count > 0) {
				if (r == 0) {
					System.out.println(r);
					System.out.println(org_num + " is Not Duck Number");
					break;
				} else {
					System.out.println(org_num + " is  Duck Number");
					break;
				}
			}
		}
		// .System.out.println(r);
		// System.out.println(count);

	}

}

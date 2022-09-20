package com.day14;

import java.util.Scanner;

public class Replace1With0 {

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org_num = num;
		int r = 0, temp = 0, rem, temp1 = 0;

		while (num > 0) {
			r = num % 10;
			if (r == 1)
				r = 0;
			temp = temp * 10 + r;// to store replaced number get number in reverse order
			num = num / 10;
		}
		// System.out.println(temp);

		while (temp > 0) {
			rem = temp % 10;
			temp1 = temp1 * 10 + rem;// reverse the reverse number from 1st while.
			temp = temp / 10;
		}
		System.out.println("After replace 1 with 0 =" + temp1);
	}

}

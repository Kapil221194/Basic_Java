package com.day20;

import java.util.Scanner;

class CheckDigit {
	public void checkPrime() {
		System.out.print("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org_num = num;
		int r = 0;
		while (num > 0) {
			r = num % 10;
			int count = 0;
			for (int i = 1; i <= r; i++) {
				if (r % i == 0) {
					count++;
				}
			}
			num = num / 10;
			if (count == 2)
				System.out.print(r + ",");
		}
	}
}

public class CheckPrimeDigit {
	public static void main(String[] args) {
		CheckDigit cd = new CheckDigit();
		cd.checkPrime();
	}

}

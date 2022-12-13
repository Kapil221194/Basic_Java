package com.exception1711;

import java.util.Scanner;

class MobNumException extends Throwable {
	MobNumException(String s) {
		super(s);
	}
}

public class MobileNumber {

	public static void checkNumber(long n) throws MobNumException {
		int count = 0;
		while (n > 0) {
			long r = n % 10;
			if (r > 0 || r < 9) {
				count++;
			}
			n = n / 10;
		}
		if (count == 10) {
			System.out.println("Valid mobile number");
		} else {
			throw new MobNumException("invalid mobile number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mobile number : ");
		long num = sc.nextLong();

		try {
			checkNumber(num);
		} catch (MobNumException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}

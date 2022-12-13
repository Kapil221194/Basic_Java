package com.exception1711;

import java.util.Scanner;

class ExceptionForExponent extends Throwable {
	ExceptionForExponent(String s) {
		super(s);
	}
}

public class PowerOfDigit {
	public static void calculatePower(int base, int exponent) throws ExceptionForExponent {
		if (exponent <= 0) {
			throw new ExceptionForExponent("Invalid exponent");
		} else {
			int num = 1;
			for (int i = exponent; i > 0; i--) {
				num = num * base;
			}
			System.out.println(base + " to the power " + exponent + " is " + num);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base value :");
		int base = sc.nextInt();
		System.out.println("Enter exponent value :");
		int exponent = sc.nextInt();

		try {
			calculatePower(base, exponent);
		} catch (ExceptionForExponent e) {
			System.out.println(e.getMessage());
		}
	}

}

package com.exception;

public class ThrowExample {

	public static void isValid(int n) {
		if (n < 18) {
			throw new ArithmeticException("invalid number");
			// System.out.println("inValid number");
			// System.out.println("hii");
		} else {
			System.out.println("valid number");
		}
		System.out.println("hello..");
	}

	public static void main(String[] args) {

		try {
			isValid(10);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}

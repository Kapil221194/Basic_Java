package com.day14;

public class Arithmatic {

	public void Calculate(int x, int y) {
		System.out.println("Addition of intigers= " + (x + y));
	}

	public void Calculate(int x, float y) {
		System.out.println("Multiplication of int and float= " + (x * y));
	}

	public void Calculate(int x, int y, float z) {
		System.out.println("Addition of 2 int and float= " + (x + y + z));
	}

	public static void main(String[] args) {

		Arithmatic a = new Arithmatic();
		a.Calculate(24, 42);
		a.Calculate(14, 21.05f);
		a.Calculate(22, 11, 9.4f);
	}

}

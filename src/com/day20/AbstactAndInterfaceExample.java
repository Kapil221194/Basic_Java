package com.day20;

abstract class Num1 {
	int x = 12;
}

interface Num2 {
	int y = 6;
}

class Sum extends Num1 implements Num2 {
	public void Addition() {
		int add = x + y;
		System.out.println("X+Y = " + add);
	}

}

public class AbstactAndInterfaceExample {

	public static void main(String[] args) {

		Sum s = new Sum();
		s.Addition();
	}

}

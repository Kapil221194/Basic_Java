package com.day15;

public class OverloadMainMethod {

	public static void main() {
		System.out.println("Main method without parameter");
	}
	public static void main(int x) {
		System.out.println("Main method with single parameter"+x);
	}
	public static void main(int x, int y) {
		System.out.println("Main method with two parameter"+x+" "+y);
	}
	public static void main(String[] args) {
		System.out.println("Main method with String[] args parameter");
		
		OverloadMainMethod.main();
		OverloadMainMethod.main(22);
		OverloadMainMethod.main(11, 19);
	}
}

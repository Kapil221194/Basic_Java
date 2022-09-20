package com.day15;

public class OverloadStaticMethod {
	
	static void math(int x) {
		System.out.println("intiger x= "+x);
	}
	static void math(int x, int y) {
		System.out.println("Addition = "+(x+y));
	}
	static void math(int x,float y) {
		System.out.println("Substracion= "+(x-y));
	}
	static void math(int x,int y,int z) {
		System.out.println("multiplication = "+(x*y*z));
	}
	
	

	public static void main(String[] args) {

		OverloadStaticMethod.math(25);
		OverloadStaticMethod.math(10, 1.23f);
		OverloadStaticMethod.math(90, 45);
		OverloadStaticMethod.math(2, 4, 6);
	}

}

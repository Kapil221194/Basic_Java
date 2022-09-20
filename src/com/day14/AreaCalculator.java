package com.day14;

public class AreaCalculator {

	public void Area(float base, float height) {
		float Area = (float) (0.5 * base * height);
		System.out.println("Area of triangle = " + Area);
	}

	public void Area(float base, int height) {
		float Area = (float) (base * height);
		System.out.println("Area of rectangle = " + Area);
	}

	public void Area(float side) {
		float Area = side * side;
		System.out.println("Area of Square = " + Area);
	}

	public void Area(int radius) {
		float Area = (float) (3.14 * radius * radius);
		System.out.println("Area of circle = " + Area);
	}

	public static void main(String[] args) {
		AreaCalculator ac = new AreaCalculator();
		ac.Area(2.5f);
		ac.Area(4);
		ac.Area(3.5f, 6);
		ac.Area(4.0f, 2.5f);

	}

}

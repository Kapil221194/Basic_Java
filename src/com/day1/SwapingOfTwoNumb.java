package com.day1;

public class SwapingOfTwoNumb {

	public static void main(String[] args) {

		int num1, num2;
		int temp;
		num1=22;
		num2=11;
		System.out.println("Numbers are "+num1+" "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after swap "+num1+" "+num2);
	}

}

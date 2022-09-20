package com.day14;

import java.util.Scanner;

public class CheckNoWeatherPowerOfThree {

	int num;
	boolean isBoolean;

	public void Power(int num) {

		System.out.print("Enter a number to check :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while (num % 3 == 0) {
			num = num / 3;
		}
		if (num == 1) {
			isBoolean = true;
			System.out.println(isBoolean);
		} else {
			isBoolean = false;
			System.out.println(isBoolean);
		}
	}

	public static void main(String[] args) {

		
		CheckNoWeatherPowerOfThree p = new CheckNoWeatherPowerOfThree();
		p.Power(p.num);
	}
}

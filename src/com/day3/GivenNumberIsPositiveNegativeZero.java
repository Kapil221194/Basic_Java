package com.day3;

import java.util.Scanner;

public class GivenNumberIsPositiveNegativeZero {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		if(i>0) {
			System.out.println("Number is Positive.");
		}else if(i<0) {
			System.out.println("Number is Negative.");
		}else {
			System.out.println("Number is Zero.");
		}
	}

}

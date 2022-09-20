package com.day3;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {

		System.out.println("ENter the Number : ");
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		if(i%5==0) {
			System.out.println("Number is divisible by 5");
		}else {
			System.out.println("Number is not divisible by 5");
		}
	}

}

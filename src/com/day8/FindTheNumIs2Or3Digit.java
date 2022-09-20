package com.day8;

import java.util.Scanner;

public class FindTheNumIs2Or3Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if((num >= 0 && num <= 9) || (num<=-1 && num>= -9)) {
			System.out.println("Number is single digit");
		}else if((num>= 10 && num<=99) || (num<= -11 && num >= -99)) {
			System.out.println("Number is double digit");
		}else {
			System.out.println("Please try again...");
		}
	}

}

package com.day3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Enter year : ");
		Scanner sc = new Scanner(System.in);
		int yr =sc.nextInt();
		if(yr%4==0) {
			System.out.println(yr+" is Leap Year ");
		}else {
			System.out.println(yr+" is not Leap Year ");
		}
	}

}
